package bronze1.Day0313;

import java.util.Scanner;

public class BOJ1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] words = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int count = 0;
        for (int i = 0; i < month - 1; i++) {
            count += arr[i];
        }

        count = (count + day) % 7;
        System.out.println(words[count]);
    }
}
