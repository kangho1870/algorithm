package bronze1.Day0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        while (true) {
//            int n = sc.nextInt();
//            if (n == 0) {
//                break;
//            }
//
//            char[] num = String.valueOf(n).toCharArray();
//            char[] reversNum = new char[num.length];
//            int j = 0;
//            for (int i = num.length - 1; i >= 0; i--) {
//                reversNum[j] = num[i];
//                j++;
//            }
//            j = 0;
//            StringBuilder a = new StringBuilder();
//            StringBuilder b = new StringBuilder();
//            for (int i = 0; i < num.length; i++) {
//                a.append(num[i]);
//                b.append(reversNum[i]);
//            }
//            if (a.toString().equals(b.toString())) {
//                System.out.println("yes");
//            }else {
//                System.out.println("no");
//            }
//        }

        while (true) {
            String number = br.readLine();
            if(number.equals("0")) {
                break;
            }

            if(isP(number)) {
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }
    }
    public static boolean isP(String number) {
        char[] number_text = number.toCharArray();
        int start_index = 0;
        int end_index = number_text.length - 1;
        while (start_index <= end_index) {
            if (number_text[start_index] != number_text[end_index]) {
                return false;
            }
            start_index++;
            end_index--;
        }
        return true;
    }
}
