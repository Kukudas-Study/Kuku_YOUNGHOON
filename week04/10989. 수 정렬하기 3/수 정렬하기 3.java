import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader는 표준 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter는 표준 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력을 받고 정수로 변환한다.
        int N = Integer.parseInt(br.readLine());

        // 크기가 N인 정수 배열을 생성한다.
        int[] arrays = new int[N];

        // N번 반복하면서 입력 받은 숫자를 정수로 변환하여 배열에 저장한다.
        for (int i = 0; i < N; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
        }

        // br을 닫는다.
        br.close();

        // 배열을 오름차순으로 정렬한다.
        Arrays.sort(arrays);

        // 정렬된 배열을 순서대로 꺼내어 줄바꿈해주면서 buffer에 쓴다.
        // BufferedReader의 readLine 메서드는 개행 문자를 기준으로 한 줄씩 입력을 읽어들이기 때문에,
        // 여러 줄의 입력을 읽을 때는 각 줄이 구분되어야 된다고 한다.
        for (int i = 0; i < N; i++) {
            bw.write(arrays[i] + "\n");
        }

        // bw의 버퍼에 남아 있는 데이터를 모두 출력한다.
        bw.flush();
        // bw를 닫는다.
        bw.close();

    }
}