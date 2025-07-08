package Silver.Lv5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int n = 1;
        int sum = 0;
        while (sum + n < X) {
            sum += n;
            n++;
        }
        int pos = X - sum;
        int numerator, denominator;
        if (n % 2 == 0) {
            numerator = pos;
            denominator = n - pos + 1;
        } else {
            numerator = n - pos + 1;
            denominator = pos;
        }
        System.out.println(numerator + "/" + denominator);
    }
} 