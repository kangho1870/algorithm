package silver5.Day0410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }else {
                    return o1.length() - o2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");

        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb);

    }
}
