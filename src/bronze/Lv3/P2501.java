package bronze.Lv3;

// BOJ 2501: 약수 구하기
// https://www.acmicpc.net/problem/2501
// N의 약수들 중 K번째로 작은 수를 출력. 없으면 0 출력.
import java.util.Scanner;

public class P2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
} 