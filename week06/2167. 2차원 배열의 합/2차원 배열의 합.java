import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 크기 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 초기화
        int[][] arr = new int[N][M];

        // 배열 값 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 합을 구해야 되는 부분 배열의 개수 입력
        int K = Integer.parseInt(br.readLine());

        // 부분 배열의 합
        for (int k = 0; k < K; k++) {
            st = new StringTokenizer(br.readLine());
            // 시작 행
            int i = Integer.parseInt(st.nextToken()) - 1;
            // 시작 열
            int j = Integer.parseInt(st.nextToken()) - 1;
            // 끝 행
            int x = Integer.parseInt(st.nextToken()) - 1;
            // 끝 열
            int y = Integer.parseInt(st.nextToken()) - 1;

            int sum = 0;
            for (int a = i; a <= x; a++) {
                for (int b = j; b <= y; b++) {
                    sum += arr[a][b];
                }
            }
            System.out.println(sum);
        }
    }
}