package bronze1.Day0312;

import java.util.Scanner;

public class BOJ2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B > A) {
            int temp = B;
            A = B;
            B = temp;
        }
        int gcd = gcd(A, B);
        System.out.println(gcd);
        System.out.println(gcd * A / gcd * B / gcd);
        // 최소 공배수 == 최대공약수 * A / 최대 공약수 * B / 최대 공약수

    }

    // 최대 공약수 == a 를 b가 나누어 나머지가 0이면 최대 공약수
    // 만약 아닌 경우 a == b로 b == 나머지를 대입하여 나머지가 0일 때까지 반복
    private static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        }else {
            return b;
        }
    }


}
