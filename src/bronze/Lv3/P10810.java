package bronze.Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = br.readLine().split(" ");
        int inputN = Integer.parseInt(inputLine[0]);
        int inputM = Integer.parseInt(inputLine[1]);
        int[] resultArr = new int[inputN];

        for (int i = 0; i < inputM; i++) {
            inputLine = br.readLine().split(" ");
            int inputI = Integer.parseInt(inputLine[0]);
            int inputJ = Integer.parseInt(inputLine[1]);
            int inputK = Integer.parseInt(inputLine[2]);

            for (int j = inputI - 1; j <= inputJ - 1; j++) {
                resultArr[j] = inputK;
            }
        }
        for (int i = 0; i < inputN; i++) {
            System.out.print(resultArr[i]);
            if (i < inputN - 1) {
                System.out.print(" ");
            }
        }
    }
}
