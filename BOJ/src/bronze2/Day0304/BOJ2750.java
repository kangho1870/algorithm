package bronze2.Day0304;

import java.util.*;

public class BOJ2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        Collections.sort(list);
        for (int num : list) {
            System.out.println(num);
        }
    }
}
