import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UpdateReadme {
    private static final String README_PATH = "../../README.md";
    private static final String SOLUTIONS_DIR = "BOJ/src";
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
            String problemList = getProblemList();
            String newReadme = README_TEMPLATE.replace("{problems}", problemList);
            Files.write(Paths.get(README_PATH), newReadme.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getProblemList() throws IOException {
        StringBuilder sb = new StringBuilder();
        File solutionsDir = new File(SOLUTIONS_DIR);

        if (!solutionsDir.exists() || !solutionsDir.isDirectory()) {
            System.out.println("❌ 솔루션 디렉토리를 찾을 수 없습니다: " + solutionsDir.getAbsolutePath());
            return "";
        }

        if (solutionsDir.exists() && solutionsDir.isDirectory()) {
            for (File difficultyDir : Objects.requireNonNull(solutionsDir.listFiles())) {
                if (difficultyDir.isDirectory()) {
                    traverseFiles(difficultyDir, sb);
                }
            }
        }
        return sb.toString();
    }

    private static void traverseFiles(File folder, StringBuilder sb) {
        for (File file : Objects.requireNonNull(folder.listFiles())) {
            if (file.isDirectory()) {
                traverseFiles(file, sb);  // 재귀 호출로 모든 하위 폴더 탐색
            } else if (file.getName().endsWith(".java")) {
                String problemNumber = file.getName().replaceAll("[^0-9]", "");
                String problemUrl = "https://www.acmicpc.net/problem/" + problemNumber;

                // 난이도(브론즈1, 브론즈2 등) 추출
                String difficulty = extractDifficulty(file);

                // 날짜(파일이 속한 Day 폴더명) 추출
                String date = extractDate(file);

                // 파일 경로 (상대 경로 변환)
                Path relativePath = Paths.get(SOLUTIONS_DIR).toAbsolutePath().relativize(file.toPath());
                String filePath = relativePath.toString().replace("\\", "/"); // Windows 경로 호환

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
