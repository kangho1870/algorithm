package bronze3.Day0224;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp > max) {
                max = temp;
            }
            if(temp < min) {
                min = temp;
            }
        }
        System.out.println(min + " " + max);
    }
}
