package bronze1.Day0310;

import java.util.Scanner;

public class BOJ1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int now = N;
        int count = 1;
        while (true) {
            int first, second;
            if (now <= 9) {
                first = 0;
                second = now;
            }else {
                first = now / 10;
                second = now % 10;
            }

            int sum = first + second;
            now = (now % 10 * 10) + (sum % 10);

            if (now == N) {
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);
    }
}
