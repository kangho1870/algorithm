package bronze1.Day0313;


import java.util.Arrays;
import java.util.Scanner;

public class BOJ2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] P = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            P[i] = sc.nextInt();
            sum += P[i];
        }

        Arrays.sort(P);

        // 9명 중 7명을 찾는거지만 달리 말하면
        // 9명 중 2명을 찾는 것도 똑같음 == 9C2
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - P[i] - P[j] == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            System.out.println(P[k]);
                        }
                    }
                }
            }
        }
    }
}
