package bronze2.Day0310;

import java.util.Scanner;

public class BOJ10820 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            char[] text = sc.nextLine().toCharArray();
            int S = 0;
            int D = 0;
            int N = 0;
            int B = 0;

            for (int i = 0; i < text.length; i++) {
                char now = text[i];
                if (now == ' ') {
                    B++;
                }else if (now >= 'a' && now <= 'z') {
                    S++;
                }else if (now >= 'A' && now <= 'Z') {
                    D++;
                }else {
                    N++;
                }
            }
            System.out.println(S + " " + D + " " + N + " " + B);
        }
    }
}
