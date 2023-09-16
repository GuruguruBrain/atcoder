// Slot Strategy 2 (Easy)

package abc.ABC320.C;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        sc.nextLine(); // 改行をスキップ
        String[] reels = new String[3];
        
        // 各リールの状態を文字列で取得
        for (int i = 0; i < 3; i++) {
            reels[i] = sc.nextLine();
        }
        sc.close();

        // 各数字がどの時間に出現するかのマップ
        Map<Integer, List<Integer>>[] timingMaps = new HashMap[3];
        
        // マップの初期化
        for (int i = 0; i < 3; i++) {
            timingMaps[i] = new HashMap<>();
        }

        // 各リールで各数字が何秒後に出現するかを記録
        for (int i = 0; i < 3; i++) {
            for (int t = 0; t < M; t++) {
                int num = reels[i].charAt(t) - '0';
                timingMaps[i].putIfAbsent(num, new ArrayList<>());
                timingMaps[i].get(num).add(t);
            }
        }

        // 最小秒数を求める
        int minTime = Integer.MAX_VALUE;
        for (int num = 0; num <= 9; num++) {
            // 3つのリールすべてに数字が存在するかチェック
            if (timingMaps[0].containsKey(num) && timingMaps[1].containsKey(num) && timingMaps[2].containsKey(num)) {
                // それぞれのリールでその数字が出る時間の組み合わせを全探索
                for (int t1 : timingMaps[0].get(num)) {
                    for (int t2 : timingMaps[1].get(num)) {
                        for (int t3 : timingMaps[2].get(num)) {
                            // 最小時間を求める（それがこの組み合わせでの必要時間）
                            int maxT = Math.max(Math.max(t1, t2), t3); // 最大の時間
                            int minT = Math.min(Math.min(t1, t2), t3); // 最小の時間

                            // 全てのリールが止まるためには最小の時間から二つの他のリールが止まるまでの時間が必要
                            int totalTime = maxT + (maxT - minT);

                            // 最小時間を更新
                            minTime = Math.min(minTime, totalTime);
                        }
                    }
                }
            }
        }
        
        // 結果の出力
        if (minTime == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minTime);
        }
    }
}