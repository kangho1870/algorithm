package bronze1.Day0312;

import java.util.Scanner;

public class BOJ2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 낮에 올라갈 수 있는 높이
        int B = sc.nextInt(); // 미끄러지는 높이
        int V = sc.nextInt(); // 나무 막대의 높이

        int C = A - B; // 하루에 올라갈 수 있는 높이 A == 2 B == 1 V == 5
        int day = (V - B) / C;
        // 나무막대의 높이에서 미끄러지는 높이를 뺀 후 하루에 올라갈 수 있는 높이를 나눈 목

        if ((V - B) % C != 0) {
            day++;
            // 나무 막대의 높이에서 미끄러지는 높이를 뺀 후 하루에 올라갈 수 있는 높이를 나눈 나머지가
            // 0이 아니면 꼭대기까지 올라가야할 높이가 남아있기 때문에 day에 1을 더해줌
        }

        System.out.println(day);
    }
}
