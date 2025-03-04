package bronze2.Day0304;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] split = s.split(" ");

        List<String> arr = new ArrayList<String>();

        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                arr.add(split[i]);
            }
        }
        System.out.println(arr.size());
    }
}
