package bronze.Lv1;

import java.io.*;
import java.util.*;

public class P11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        // N이 1인 경우 아무것도 출력하지 않음
        if (N == 1) {
            return;
        }
        
        // 소인수분해 수행
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
            }
        }
        
        // 남은 수가 1보다 크면 그 자체가 소수
        if (N > 1) {
            bw.write(N + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
