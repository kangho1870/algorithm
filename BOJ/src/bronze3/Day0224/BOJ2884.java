package bronze3.Day0224;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min < 45) {
            min += 60;
            if(hour == 0) {
                hour = 23;
            }else {
                hour--;
            }
        }
        min = min - 45;
        System.out.println(hour + " " + min);
    }
}
