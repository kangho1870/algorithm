package bronze3.Day0227;

import java.util.Scanner;

public class BOJ2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                if (i >= j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = i - 1; j > 0; j--) { // j == 4, i == 5
                if (j < i) { // 4 < 5
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j > i - 2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if(j > i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
