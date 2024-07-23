import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 결과값을 저장하는 변수를 0으로 초기화한다.(생성자가 없으면 0을 출력한다.)
        int M = 0;

        // 1부터 N까지 모든 숫자를 검사한다
        for (int i = 1; i <= N; i++) {
            // i 값을 number 변수에 저장한다.
            int number = i;
            // 각 자릿수 합을 저장할 변수를 0으로 초기화한다.
            int sum = 0;

            // number가 0보다 큰 동안 반복문을 실행한다.(각 자리수를 더하기 위해)
            while (number > 0) {
                // 자릿수를 10으로 분해해서 sum에 더해준다.
                sum += number % 10;
                // 반복을 돌고 있는 number의 값을 10씩 분해하여 반복한다.
                number /= 10;
            }
            // i(number)수와 각 자릿수의 합이 N과 같으면 생성자라는 뜻인 반복문을 종료한다.
            if (sum + i == N) {
                M = i;
                break;
            }
        }
        System.out.println(M);
    }
}