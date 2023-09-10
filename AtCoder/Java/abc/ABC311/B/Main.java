// Vacation Together

/* tag
 * マス目
 */

package abc.ABC311.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        char[][] S = new char[N][D];
        for (int i = 0; i < N; i++) {
            S[i] = sc.next().toCharArray(); // 各人の予定を文字列から配列に変換して格納
        }

        int maxFreeDays = 0; // 連続する全員が暇な日の最大数
        int curFreeDays = 0; // 現在の連続する全員が暇な日の数

        // 各日
        for (int j = 0; j < D; j++) {
            boolean allFree = true; // 当日全員が暇かどうかのフラグ
            // 各人
            for (int i = 0; i < N; i++) {
                // 暇でない人がいれば、フラグをfalseにしてループを抜ける
                if (S[i][j] == 'x') {
                    allFree = false;
                    break;
                }
            }

            // 当日全員が暇なら、現在の連続する暇な日の数を増やす
            if (allFree) {
                curFreeDays++;
            } else {
                // そうでなければ、これまでの最大数と現在の連続する暇な日の数を比較し、最大値を更新
                maxFreeDays = Math.max(maxFreeDays, curFreeDays);
                // 現在の連続する暇な日の数をリセット
                curFreeDays = 0;
            }
        }

        // これまでの最大数と最後の連続する暇な日の数を比較し、最大値を更新
        maxFreeDays = Math.max(maxFreeDays, curFreeDays);

        System.out.println(maxFreeDays);
    }
}