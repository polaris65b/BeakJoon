package bronze.Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        
        // 현재 위치에서 각 경계선까지의 거리 계산
        int distanceToLeft = x;           // 왼쪽 경계선까지의 거리
        int distanceToRight = w - x;      // 오른쪽 경계선까지의 거리
        int distanceToBottom = y;         // 아래쪽 경계선까지의 거리
        int distanceToTop = h - y;        // 위쪽 경계선까지의 거리
        
        // 네 방향 중 최소 거리 찾기
        int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight), 
                                  Math.min(distanceToBottom, distanceToTop));
        
        System.out.println(minDistance);
        
        br.close();
    }
}
