package bronze.Lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[][] matrix = new int[9][9];
        int max = -1;
        int maxRow = 0;
        int maxCol = 0;
        
        // 9x9 행렬 입력 받기
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                // 최댓값과 그 위치 갱신
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i + 1; // 1부터 시작하는 행 번호
                    maxCol = j + 1; // 1부터 시작하는 열 번호
                }
            }
        }
        
        // 결과 출력
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
} 