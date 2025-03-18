package Silver.Lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int plasticBagFive = N / 5;
        int remain = N % 5;

        while (plasticBagFive >= 0) {
            if (remain % 3 == 0) {
                System.out.println(plasticBagFive + (remain / 3));
                return;
            }
            plasticBagFive--;
            remain += 5;
        }
        System.out.println(-1);
    }
}
