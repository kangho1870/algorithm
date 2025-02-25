package bronze3.Day0224;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i <= 8; i++) {
            int number = sc.nextInt();
            if(number > max) {
                max = number;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
