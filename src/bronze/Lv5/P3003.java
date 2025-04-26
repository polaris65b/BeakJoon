package bronze.Lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chessPice = {1, 1, 2, 2, 2, 8};
        int[] needPice = {0,0,0,0,0,0};
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < 6; i++) {
            needPice[i] = chessPice[i] - numbers[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(needPice[i] + " ");
        }
    }
}
