package bronze.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            result[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            String[] inputNUm = br.readLine().split(" ");
            int i = Integer.parseInt(inputNUm[0]) - 1;
            int j = Integer.parseInt(inputNUm[1]) - 1;

            int temp = result[j];
            result[j] = result[i];
            result[i] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
