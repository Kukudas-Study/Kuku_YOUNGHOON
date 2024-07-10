import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = 1000 - Integer.parseInt(br.readLine());
        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;
        int i = 0;
        while (cost != 0) {
            if (cost - coins[i] >= 0) {
                cost -= coins[i];
                count++;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}