package bronze4.Day0224;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        int min_b = Math.min(n, Math.min(m, s));

        int d = sc.nextInt();
        int e = sc.nextInt();

        int min_s = Math.min(d, e);

        System.out.println(min_b + min_s - 50);
    }
}
