package bronze3.Day0226;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> result = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if(s.length() > 10) {
//                result.add(s.substring(0, 10));
//                s = s.substring(10);
//            }else {
//                result.add(s);
//                break;
//            }
//        }
//        for (String value : result) {
//            System.out.println(value);
//        }

        for (int i = 0; i < s.length(); i = i + 10) {
            if (i + 10 < s.length()) {
                result.add(s.substring(i, i + 10));
            }else {
                result.add(s.substring(i));
            }
        }

        for (String value : result) {
            System.out.println(value);
        }
    }
}
