package bronze1.Day0318;

import java.util.Scanner;

public class BOJ1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] text = new char[n][];

        for (int i = 0; i < n; i++) {
            text[i] = sc.next().toCharArray();
        }
        int[] arr = new int[text[0].length];
        for (int i = 0; i < text[0].length; i++) {
            for (int j = 0; j < n; j++) {
                if (text[j][i] != text[0][i]) {
                    arr[i] = 1;
                }
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < text[0].length; j++) {
                if (arr[j] == 0) {
                    System.out.print(text[0][j]);
                }else {
                    System.out.print("?");
                }
            }
        }
    }
}
