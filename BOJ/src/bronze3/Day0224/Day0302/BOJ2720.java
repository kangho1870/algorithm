package bronze3.Day0224.Day0302;

import java.util.Scanner;

public class BOJ2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int quarters = N / 25;
            N %= 25;
            int dimes = N / 10;
            N %= 10;
            int nickels = N / 5;
            N %= 5;
            int pennies = N;

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}
