package bronze1.Day0310;

import java.util.Scanner;

public class BOJ1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[26];
        char[] text = sc.nextLine().toCharArray();

        for (int i = 0; i < text.length; i++) {
            char now = text[i];
            int index = -1;
            if ('a' <= now && now <= 'z') {
                index = now - 'a';
            }else {
                index = now - 'A';
            }
            count[index]++;
        }
        int Max = -1;
        int Max_Cnt = 0;
        int Max_index = -1;
        for (int i = 0; i < 26; i++) {
            if(Max < count[i]) {
                Max = count[i];
                Max_Cnt = 1;
                Max_index = i;
            }else if(Max == count[i]) {
                Max_Cnt++;
            }
        }
        if(Max_Cnt == 1) {
            System.out.println((char) ('A' + Max_index));
        }else {
            System.out.println("?");
        }
    }
}
