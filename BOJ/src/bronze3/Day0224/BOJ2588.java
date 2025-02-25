package bronze3.Day0224;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        // 곱하기의 과정을 코딩으로 표현
        // point - 1의 자리부터 곱하면서 더하고, 자리수 신경써주기
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char[] B = sc.next().toCharArray();
        int sum = 0;
        int su = 1;
        for (int i = 2; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(B[i]));
            System.out.println(A * temp);
            sum += (A * temp) * su;
            su = su * 10;
        }
        System.out.println(sum);
    }
}
