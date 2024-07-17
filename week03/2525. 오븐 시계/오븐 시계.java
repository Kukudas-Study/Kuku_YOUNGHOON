import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 시간을 입력 받는다.
        int A = in.nextInt();
        // 분을 입력 받는다.
        int B = in.nextInt();
        // 요리하는 데 필요한 시간을 입력받는다.
        int C = in.nextInt();

        // 시간과 분을 하나의 분으로 변한환다.
        int min = 60 * A + B;
        // 시간과 분을 하나의 분으로 변한환 값에 요리하는 데 필요한 시간을 더한다.
        min += C;

        // 시간을 구하기 위해서는 1시간 = 60분이니 분 / 60을 해서 몫을 구한다.
        int hour = (min / 60) % 24;
        // 분을 구하기 위해서는 분 / 60을 한 값의 나머지를 구한다.
        int minute = min % 60;

        System.out.println(hour + " " + minute);
    }
}