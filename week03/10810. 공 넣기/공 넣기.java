import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 배열 길이
        int M = sc.nextInt(); // 반복 횟수

        int[] arr = new int[N]; // 바구니 수 만큼 배열 만들기

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt();   // i번 바구니부터
            int j = sc.nextInt();   // j번 바구니까지
            int k = sc.nextInt();   // k번 번호의 공을 넣는다

            for (int y = i - 1; y < j; y++) { // 입력 받은 줄에서의 반복
                arr[y] = k;
            }

        }

        for (int baguni : arr) {
            System.out.print(baguni + " ");
        }

    }
}