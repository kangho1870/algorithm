package bronze1.Day0311;

import java.util.Scanner;

public class BOJ11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        if (N < B) {
            if (N > 9) {
                System.out.println((char) (N + 55));
            }else {
                System.out.println(N);
            }
        }else {
            int cnt = 0;
            double temp = B;
            while (temp <= N) {
                temp = Math.pow(B, ++cnt);
            } // N을 B 진법으로 표현했을 때 몇승 까지 표현되는지 계산
            // N == 60466175 B == 36
            // 36의 4승은 60466176 이므로 cnt는 4

            while (cnt > 0) {
                temp = Math.pow(B, --cnt);
                // B == 36 cnt == 4
                // 36의 4승 == 1679616
                int now = ((int) (N / temp));
                // 60466175 / 1679616 == 35
                if (now > 9) {
                    System.out.print((char) (now + 55));
                    // A의 아스키코드 값을 더해서 문자로 표현
                }else {
                    System.out.print(now);
                }
                N = (int) (N % temp);

            }
        }
    }
}
