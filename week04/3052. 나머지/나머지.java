import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력 값이 10개로 정해져있기 때문에 길이가 10인 int형 배열을 생성한다.
        int[] num = new int[10];
        // 서로 다른 값이 몇개인지 확인 할 변수 count를 생성하고 0으로 초기화한다.
        int count = 0;

        // 10개의 숫자를 입력 받고 42로 나눈 몫을 구한다.
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt() % 42;
        }

        // 10개의 중복된 값이 있는지 확인한다.
        for (int i = 0; i < 10; i++) {
            int temp = 0;
            // i와 j의 값을 비교해서 같으면 temp를 증가시킨다.
            for (int j = i + 1; j < 10; j++) {
                if (num[i] == num[j]) {
                    temp++;
                }
            }
            // i와 j의 값이 같지 않은 경우 count의 값을 증가시킨다.
            if (temp == 0) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
