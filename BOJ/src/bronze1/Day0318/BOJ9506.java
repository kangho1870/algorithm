package bronze1.Day0318;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < list.size() - 1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size() - 1));
            }else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}