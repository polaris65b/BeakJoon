package bronze.Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String n = input[0];
        int b = Integer.parseInt(input[1]);
        System.out.println(Integer.parseInt(n, b));
    }
}