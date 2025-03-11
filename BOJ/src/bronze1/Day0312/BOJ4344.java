package bronze1.Day0312;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 학생 수
            int S = 0; // 점수의 합
            int[] P = new int[N]; // 점수를 저장할 배열
            for (int j = 0; j < N; j++) {
                P[j] = Integer.parseInt(st.nextToken());
                // 각 점수를 저장
                S += P[j];
                // 합계에 점수 누적
            }
            double avg = S / (double) N; // 평균 점수

            int overAvg = 0; // 평균을 넘는 학생의 수

            for (int j = 0; j < N; j++) {
                if (P[j] > avg) {
                    overAvg++;
                }
            }
            System.out.println(Math.round(overAvg / (double) N * 100 * 1000) / 1000.0 + "%");
            // Math.round() == 소수점 첫째 자리에서 반올림
            // 평균점수를 넘는 학생들의 비율을 %로 표시하기 위해 100을 곱함
            // Math.round()는 소수점 첫째 자리에서 반올림을 하기때문에 1000을 곱하여 표시하고자 하는 자리수까지 올림
            // 그후 1000.0을 나눈 목을 구함
        }
    }
}
