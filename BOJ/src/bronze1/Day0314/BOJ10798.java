package bronze1.Day0314;

import java.util.Scanner;

public class BOJ10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] map = new char[5][15];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                map[i][j] = ' ';
            }
        }
        for (int i = 0; i < 5; i++) {
            char[] text = sc.nextLine().toCharArray();
            for (int j = 0; j < text.length; j++) {
                map[i][j] = text[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (map[j][i] != ' ') {
                    System.out.print(map[j][i]);
                }
            }
        }
    }
}
