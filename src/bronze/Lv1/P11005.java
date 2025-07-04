package bronze.Lv1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class P11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            int r = N % B;
            if (r < 10) sb.append((char)('0' + r));
            else sb.append((char)('A' + (r - 10)));
            N /= B;
        }
        System.out.println(sb.reverse());
    }
} 