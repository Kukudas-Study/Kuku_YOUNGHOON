import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt(); 

            int X, Y;

            if (N % H == 0) {
                Y = H * 100;
                X = N / H;
            } else {
                Y = (N % H) * 100;
                X = (N / H) + 1;
            }

            System.out.println(Y + X);
        }
    }
}