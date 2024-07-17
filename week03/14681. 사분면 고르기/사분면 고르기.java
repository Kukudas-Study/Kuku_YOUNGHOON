import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수를 입력 받는다.
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X > 0) {
            if (Y > 0) {
                System.out.print(1);
            } else {
                System.out.print(4);
            }
        } else {
            if (Y > 0) {
                System.out.print(2);
            } else {
                System.out.print(3);
            }
        }
    }
}

