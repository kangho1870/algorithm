import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UpdateReadme {
    private static final String README_PATH = "../../README.md";
    private static final String SOLUTIONS_DIR = System.getProperty("user.dir") + "/BOJ/src"; // ✅ 절대 경로 설정
    private static final String README_TEMPLATE =
            "# 🚀 Baekjoon Algorithm Study\n" +
                    "백준 알고리즘 문제를 하루 2~3문제씩 꾸준히 풀어나가는 레포지토리입니다.\n" +
                    "목표: 브론즈부터 시작하여 차근차근 실력을 쌓아가기!\n\n" +
                    "## 🛠 사용 언어  \n" +
                    "- Java  \n\n" +
                    "## 💡 목표  \n" +
                    "- 백준 티어 상승  \n" +
                    "- 알고리즘 개념 정리  \n" +
                    "- CS 지식 함께 공부  \n\n" +
                    "## 📌 진행 현황\n" +
                    "| 날짜 | 문제 | 난이도 | 코드 |\n" +
                    "|------|------|-------|------|\n{problems}";

    public static void main(String[] args) {
        try {
            File readmeFile = new File(README_PATH);
            if (!readmeFile.exists()) {
                System.out.println("❌ README.md 파일이 존재하지 않습니다.");
                return;
            }

            // 현재 디렉토리 확인
            System.out.println("🔍 현재 작업 디렉토리: " + System.getProperty("user.dir"));
            System.out.println("🔍 탐색할 솔루션 디렉토리: " + SOLUTIONS_DIR);

            String problemList = getProblemList();

            String currentReadme = Files.readString(Paths.get(README_PATH));
            String newReadme = README_TEMPLATE.replace("{problems}", problemList);

            if (!currentReadme.equals(newReadme)) {
                Files.write(Paths.get(README_PATH), newReadme.getBytes());
                System.out.println("✅ README.md 파일이 업데이트되었습니다.");
            } else {
                System.out.println("⚠ 변경 사항이 없어 README.md를 수정하지 않았습니다.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getProblemList() throws IOException {
        StringBuilder sb = new StringBuilder();
        File solutionsDir = new File(SOLUTIONS_DIR);

        System.out.println("🔍 현재 탐색 중인 디렉토리: " + solutionsDir.getAbsolutePath());

        if (!solutionsDir.exists() || !solutionsDir.isDirectory()) {
            System.out.println("❌ 솔루션 디렉토리를 찾을 수 없습니다: " + solutionsDir.getAbsolutePath());
            return "";
        }

        for (File difficultyDir : Objects.requireNonNull(solutionsDir.listFiles())) {
            if (difficultyDir.isDirectory()) {
                traverseFiles(difficultyDir, sb);
            }
        }
        return sb.toString();
    }

    private static void traverseFiles(File folder, StringBuilder sb) {
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isDirectory()) {
                traverseFiles(file, sb);
            } else if (file.getName().endsWith(".java")) {
                String problemNumber = file.getName().replaceAll("[^0-9]", "");
                String problemUrl = "https://www.acmicpc.net/problem/" + problemNumber;
                String difficulty = extractDifficulty(file);
                String date = extractDate(file);

                Path relativePath = Paths.get(SOLUTIONS_DIR).toAbsolutePath().relativize(file.toPath());
                String filePath = relativePath.toString().replace("\\", "/");

                sb.append(String.format("| %s | [%s](%s) | %s | [🔗 코드 보기](%s) |\n",
                        date, problemNumber, problemUrl, difficulty, filePath));
                System.out.println("📌 문제 추가됨: " + problemNumber);
            }
        }
    }

    private static String extractDifficulty(File file) {
        File parent = file.getParentFile();
        while (parent != null) {
            String name = parent.getName();
            if (name.matches("bronze[1-5]|silver[1-5]|gold[1-5]|platinum[1-5]|diamond[1-5]|ruby[1-5]")) {
                return name;
            }
            parent = parent.getParentFile();
        }
        return "Unknown";
    }

    private static String extractDate(File file) {
        File parent = file.getParentFile();
        while (parent != null) {
            if (parent.getName().matches("Day\\d{4}")) {  // 예: Day0312
                return parent.getName();
            }
            parent = parent.getParentFile();
        }
        return "-";
    }
}
