package bronze1.Day0319;

import java.util.Scanner;

public class BOJ1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] T = new int[1001];
        int index = 1;
        for (int i = 0; index < 1000; i++) {
            for (int j = i; j < i && index < 1000; j++) {
                T[index++] = i;
            }
        }
    }
}
