import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 9개 중 7개의 합이 100 == 9개중 2개의 합이 9개의 총합 - 100

        // 9명의 난쟁이를 키를 저장할 배열 선언한다.
        int[] arr = new int[9];
        // 난쟁이 키의 합을 저장할 변수 sum을 0으로 초기화한다.
        int sum = 0;

        // 9명의 난쟁이 키를 입력 받아 배열에 저장한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            // 입력 받은 키를 sum에 더해준다.
            sum += arr[i];
        }

        // 배열을 정렬한다.
        Arrays.sort(arr);

        // 라벨을 붙여 반복문을 빠져나갈 수 있게 해준다.
        a:
        // 반복문을 통해 두 난쟁이 키의 합이 sum - 100 인 난쟁이의 키를 0으로 바꿔준다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum - 100) {
                    arr[i] = arr[j] = 0;
                    // 가짜 두 난쟁이를 찾으면 반복문을 바로 빠져나가게 한다.
                    break a;
                }
            }
        }

        // 배열을 순회해 0이 아닌 요소들만 출력한다.(진짜 난쟁이들만)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}