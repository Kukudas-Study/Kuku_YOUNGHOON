import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 연도를 입력 받는다.
        int year = sc.nextInt();

        // 연도가 4의 배수이면서, 400의 배수이거나 100의 배수가 아닐때를 찾는다.
        if(year%4==0) {
            if(year%400==0) {
                System.out.println("1");
            } else if(year % 100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
