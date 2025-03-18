package Silver.Lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int plasticBagThree = 0;
        int plasticBagFive = 0;

        plasticBagFive = N / 5;

        int remain = N - plasticBagFive * 5;

        while (remain < N) {
            if (remain % 3 == 0) {
                plasticBagThree = remain / 3;
                break;
            }
            plasticBagFive -= 1;
            remain = remain + 5;
        }

        if (remain % 3 == 0) {
            plasticBagThree = remain / 3;
            System.out.println(plasticBagFive + plasticBagThree);
        } else if (remain == N) {
            System.out.println(-1);
        } else {
            System.out.println(plasticBagFive + plasticBagThree);
        }
    }
}
