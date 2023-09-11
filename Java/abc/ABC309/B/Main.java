// Rotate
package abc.ABC309.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] table = new int[N][N];
        List<Integer> outerRing = new ArrayList<>();
        
        // マス目の入力
        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < N; j++) {
                table[i][j] = Integer.parseInt(String.valueOf(row.charAt(j)));
            }
        }

        // 入力された値をまとめてリストに格納
        for(int i = 0; i < N; i++) outerRing.add(table[0][i]); // 上の行
        for(int i = 1; i < N; i++) outerRing.add(table[i][N - 1]); // 右の列
        for(int i = N - 2; i >= 0; i--) outerRing.add(table[N - 1][i]); // 下の行
        for(int i = N - 2; i > 0; i--) outerRing.add(table[i][0]); // 左の列

        // リストの要素を右に1つずらす
        outerRing.add(0, outerRing.remove(outerRing.size() - 1));

        // ずらした要素をマス目に戻す
        int k = 0;
        for(int i = 0; i < N; i++) table[0][i] = outerRing.get(k++); // 上の行
        for(int i = 1; i < N; i++) table[i][N - 1] = outerRing.get(k++); // 右の列
        for(int i = N - 2; i >= 0; i--) table[N - 1][i] = outerRing.get(k++); // 下の行
        for(int i = N - 2; i > 0; i--) table[i][0] = outerRing.get(k++); // 左の列

        // 処理結果を出力
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
}