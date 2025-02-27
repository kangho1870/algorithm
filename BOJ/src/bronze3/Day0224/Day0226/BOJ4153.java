package bronze3.Day0224.Day0226;

import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean result = false;

            if (a == 0 && b == 0 && c == 0) {
                break;
            }else {
                if (a > b && a > c) {
                    if (a * a == b * b + c * c) {
                        result = true;
                    }
                }else if (b > a && b > c) {
                    if (b * b == a * a + c * c) {
                        result = true;
                    }
                }else {
                    if (c * c == a * a + b * b) {
                        result = true;
                    }
                }

                if (result) {
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
