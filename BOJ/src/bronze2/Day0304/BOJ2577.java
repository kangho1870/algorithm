package bronze2.Day0304;

import java.util.Scanner;

public class BOJ2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String d = String.valueOf(a * b * c);
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;

        for (int i = 0; i < d.length(); i++) {
            if (d.charAt(i) == '0') {
                zero++;
            }else if (d.charAt(i) == '1') {
                one++;
            }else if (d.charAt(i) == '2') {
                two++;
            }else if (d.charAt(i) == '3') {
                three++;
            }else if (d.charAt(i) == '4') {
                four++;
            }else if (d.charAt(i) == '5') {
                five++;
            }else if (d.charAt(i) == '6') {
                six++;
            }else if (d.charAt(i) == '7') {
                seven++;
            }else if (d.charAt(i) == '8') {
                eight++;
            }else if (d.charAt(i) == '9') {
                nine++;
            }
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}
