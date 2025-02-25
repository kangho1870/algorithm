package bronze4.Day0224;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int kg = Integer.parseInt(st.nextToken());

            if(name.equals("#") && age == 0 && kg == 0) {
                break;
            }

            if(age > 17 || kg >= 80) {
                System.out.println(name + " Senior");
            }else {
                System.out.println(name + " Junior");
            }
        }
    }
}
