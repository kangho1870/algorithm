package bronze4.Day0224;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
//        System.out.println((int) 'a'); -> a = 97
        Scanner sc = new Scanner(System.in);
        char[] temp = sc.next().toCharArray();
        int[] A = new int[26];

        for(int i = 0; i < temp.length; i++) {
            A[temp[i] - 97]++;
        }

        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
