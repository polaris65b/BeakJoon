package bronze.Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int c = Integer.parseInt(br.readLine());
            int[] coins = {25, 10, 5, 1};
            int[] result = new int[4];
            for (int i = 0; i < coins.length; i++) {
                result[i] = c / coins[i];
                c %= coins[i];
            }
            System.out.println(result[0] + " " + result[1] + " " + result[2] + " " + result[3]);
        }
    }
} 