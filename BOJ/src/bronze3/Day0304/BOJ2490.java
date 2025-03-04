package bronze3.Day0304;

import java.util.Scanner;

public class BOJ2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a + b + c + d == 3) {
                System.out.println("A");
            }else if (a + b + c + d == 2) {
                System.out.println("B");
            }else if (a + b + c + d == 1) {
                System.out.println("C");
            }else if (a + b + c + d == 0) {
                System.out.println("D");
            }else {
                System.out.println("E");
            }
        }
    }
}
