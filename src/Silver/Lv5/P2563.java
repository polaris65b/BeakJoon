package Silver.Lv5;

import java.io.*;
import java.util.StringTokenizer;

public class P2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int area = 0;
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            // 색종이 영역을 true로 표시
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!paper[j][k]) {
                        paper[j][k] = true;
                        area++;
                    }
                }
            }
        }
        
        System.out.println(area);
        br.close();
    }
} 