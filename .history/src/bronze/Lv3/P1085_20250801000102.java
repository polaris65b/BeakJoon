package bronze.Lv3;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        // 현재 위치에서 각 경계선까지의 거리 계산
        int distanceToLeft = x;           // 왼쪽 경계선까지의 거리
        int distanceToRight = w - x;      // 오른쪽 경계선까지의 거리
        int distanceToBottom = y;         // 아래쪽 경계선까지의 거리
        int distanceToTop = h - y;        // 위쪽 경계선까지의 거리
        
        // 네 방향 중 최소 거리 찾기
        int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight), 
                                  Math.min(distanceToBottom, distanceToTop));
        
        System.out.println(minDistance);
        
        sc.close();
    }
}
