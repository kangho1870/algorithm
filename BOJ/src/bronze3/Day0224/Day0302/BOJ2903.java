package bronze3.Day0224.Day0302;

import java.util.Scanner;

public class BOJ2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int point = 2;

        for (int i = 1; i <= n; i++) {
            point = point + (point - 1);
        }
        System.out.println(point * point);
    }
}
