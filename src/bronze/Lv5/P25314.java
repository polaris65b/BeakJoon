package bronze.Lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputN = Integer.parseInt(br.readLine());

        for (int i = inputN/4; i > 0; i--) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
