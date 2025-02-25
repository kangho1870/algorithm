package bronze3.Day0224;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B += C;
        if(B > 59) {
            A = (A + B / 60) % 24;
            B = B % 60;
        }
        System.out.println(A + " " + B);
    }
}
