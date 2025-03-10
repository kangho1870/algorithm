package bronze2.Day0310;

import java.util.Scanner;

public class BOJ7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        int sum = 10;
        char before = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] == before) {
                sum += 5;
                before = A[i];
            }else {
                sum += 10;
                before = A[i];
            }
        }
        System.out.println(sum);
    }
}
