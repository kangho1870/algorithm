import java.io.*;
import java.nio.file.*;
import java.util.*;

public class UpdateReadme {
    private static final String README_PATH = "README.md";
    private static final String SOLUTIONS_DIR = "solutions";
    private static final String README_TEMPLATE =
            "# 🚀 Baekjoon Algorithm Study\n" +
                    "백준 알고리즘 문제를 하루 2~3문제씩 꾸준히 풀어나가는 레포지토리입니다.\n" +
                    "목표: 브론즈부터 시작하여 차근차근 실력을 쌓아가기!\n\n" +
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

        if (solutionsDir.exists() && solutionsDir.isDirectory()) {
            for (File difficultyDir : Objects.requireNonNull(solutionsDir.listFiles())) {
                if (difficultyDir.isDirectory()) {
                    String difficulty = difficultyDir.getName();

                    for (File file : Objects.requireNonNull(difficultyDir.listFiles())) {
                        if (file.getName().endsWith(".java")) {
                            String problemNumber = file.getName().replaceAll("[^0-9]", "");
                            String problemUrl = "https://www.acmicpc.net/problem/" + problemNumber;
                            String filePath = SOLUTIONS_DIR + "/" + difficulty + "/" + file.getName();
                            sb.append(String.format("| - | [%s](%s) | %s | [🔗 코드 보기](%s) |\n",
                                    problemNumber, problemUrl, difficulty, filePath));
                        }
                    }
                }
            }
        }
        return sb.toString();
    }
}
