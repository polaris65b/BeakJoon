package bronze.Lv5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            System.out.println("" + first + last);
        }
    }
}
