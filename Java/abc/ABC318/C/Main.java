// Blue Spring

package abc.ABC318.C;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ユーザーからの入力を受け取る
        int N = sc.nextInt();  // 旅行する合計日数
        int D = sc.nextInt();  // 1セットの周遊パスの枚数
        long P = sc.nextLong();  // 1セットの周遊パスの価格
        sc.close();

        long totalFare = 0;  // 運賃の合計
        long F[] = new long[N];  // 各日の運賃
        
        // 各日の運賃を初期化し、運賃の合計を計算する
        for (int i = 0; i < N; i++) {
            F[i] = sc.nextLong();
            totalFare += F[i];
        }

        // 各日の運賃を昇順にソートする
        Arrays.sort(F);

        // パスを使わない場合の運賃の合計で結果を初期化
        long minCost = totalFare;

        // 最小運賃を計算する
        minCost = calculateMinimumFare(F, N, D, P, totalFare);

        System.out.println(minCost);
    }

    // 最小運賃を計算するメソッド
    public static long calculateMinimumFare(long[] F, int N, int D, long P, long totalFare) {
        int highestFareIndex = N - 1;  // 最も高い運賃から始める
        long minCost = totalFare;

        // 周遊パスを1セットからN/Dセットまで購入した場合の運賃を計算
        for (int i = 1; i <= N / D; i++) {
            long costForCurrentPassSets = i * P;

            // 運賃が高い日からパスを使う
            for (int j = 0; j < D; j++) {
                totalFare -= F[highestFareIndex];
                highestFareIndex--;
            }
            minCost = Math.min(minCost, costForCurrentPassSets + totalFare);
        }

        // 特別ケース: NがDで割り切れない場合
        if (N % D != 0) {
            minCost = Math.min(minCost, (N / D + 1) * P);
        }

        return minCost;
    }
}