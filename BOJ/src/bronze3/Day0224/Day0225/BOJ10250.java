package bronze3.Day0224.Day0225;

import java.util.Scanner;

public class BOJ10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 층
            int W = sc.nextInt(); // 층당 호수
            int N = sc.nextInt(); // N번째 손님

            int F = N % H; // 머물게 될 층수
            int R = N / H; // 머물게 될 호수

            if (F == 0) { // 꼭대기 층일 경우
                if (R < 10) { // 호수가 10 미만일 경우 0 붙여주기
                    System.out.println(H + "0" + R);
                }else {
                    System.out.println(H + "" + R);
                }
            }else {
                R++;
                if (R < 10) {
                    System.out.println(F + "0" + R);
                }else {
                    System.out.println(F + "" + R);
                }
            }
        }
    }
}
