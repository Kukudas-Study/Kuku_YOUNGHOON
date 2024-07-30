import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 효율적으로 처리하기 위해 BufferedReader를 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 효율적으로 처리하기 위해 BufferedWriter를 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // Queue를 LinkedList로 구현
        Queue<Integer> queue = new LinkedList<>();

        // 명령의 개수를 입력받아 변수 N에 저장
        int N = Integer.parseInt(br.readLine());
        // 큐에 마지막으로 추가된 값을 저장할 변수 i 초기화
        int i = 0;

        // N번 반복하여 명령을 처리
        for (int j = 0; j < N; j++) {
            // 명령어를 한 줄 입력받음
            String raw_cmd = br.readLine();
            // 명령어의 첫 번째 단어를 분리하여 변수 cmd에 저장
            String cmd = raw_cmd.split(" ")[0];

            // 명령어가 "push"인 경우
            if (cmd.equals("push")) {
                // push 명령의 두 번째 부분(정수)을 변수 i에 저장
                i = Integer.parseInt(raw_cmd.split(" ")[1]);
                // 큐에 i 값을 추가
                queue.add(i);
            }
            // 명령어가 "pop"인 경우
            else if (cmd.equals("pop")) {
                // 큐에서 가장 앞에 있는 값을 제거하고 변수 num에 저장 (큐가 비어 있으면 null 반환)
                Integer num = queue.poll();
                // num이 null이면 -1을, 아니면 num 값을 출력
                bw.write(((num == null) ? -1 : num) + "\n");
            }
            // 명령어가 "size"인 경우
            else if (cmd.equals("size")) {
                // 큐의 크기를 출력
                bw.write(queue.size() + "\n");
            }
            // 명령어가 "empty"인 경우
            else if (cmd.equals("empty")) {
                // 큐가 비어 있으면 1을, 아니면 0을 출력
                bw.write((queue.isEmpty() ? 1 : 0) + "\n");
            }
            // 명령어가 "front"인 경우
            else if (cmd.equals("front")) {
                // 큐가 비어 있으면 -1을, 아니면 큐의 가장 앞에 있는 값을 출력
                bw.write((queue.size() == 0 ? -1 : queue.peek()) + "\n");
            }
            // 명령어가 "back"인 경우
            else if (cmd.equals("back")) {
                // 큐가 비어 있으면 -1을, 아니면 변수 i 값을 출력 (i는 마지막으로 큐에 추가된 값)
                bw.write((queue.size() == 0 ? -1 : i) + "\n");
            }
        }

        // 버퍼에 남아 있는 내용을 모두 출력
        bw.flush();
        // BufferedWriter를 닫아줌
        bw.close();
    }
}