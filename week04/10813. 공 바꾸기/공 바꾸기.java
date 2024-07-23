import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 바구니 개수
        int N = sc.nextInt();
        // 공 교환 횟수
        int M = sc.nextInt();

        // 바구니
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            // 바구니 공 초기화(배열의 인덱스는 0부터 시작하니까 첫 번째 바구니에 +1을 해준다.)
            arr[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            // 두 변수의 값을 바꿀때는 임시변수를 생성해서 거기에 값을 넣고 교환하는 방식으로 한다.
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }
        sc.close();

        for (int baguni : arr) {
            System.out.print(baguni + " ");
        }
    }
}
