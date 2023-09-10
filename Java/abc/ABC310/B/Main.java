// Strictly Superior

package abc.ABC310.B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 商品の数
        int M = sc.nextInt(); // 機能の最大数

        // 商品の価格と機能を保存するための変数
        int[] prices = new int[N];
        List<Set<Integer>> allFeatures = new ArrayList<>();

        // 入力を読み込んで価格と機能を保存する
        for (int i = 0; i < N; i++) {
            prices[i] = sc.nextInt(); // 商品の価格
            int numFeatures = sc.nextInt(); // 商品の機能数
            Set<Integer> features = new HashSet<>();
            for (int j = 0; j < numFeatures; j++) {
                features.add(sc.nextInt()); // 機能を追加
            }
            allFeatures.add(features); // 商品の機能をリストに追加
        }

        // すべての商品ペアを検証し、条件を満たすものがあるか確認する
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 自分自身とは比較しない
                if (i != j) {
                    // 条件1と条件2を確認: i の価格が j より大きく、j のすべての機能が i に存在する
                    if (prices[i] >= prices[j] && allFeatures.get(j).containsAll(allFeatures.get(i))) {
                        // 条件3を確認: i の価格が j より大きい、または j に i にはない機能が存在する
                        if (prices[i] > prices[j] || !allFeatures.get(i).containsAll(allFeatures.get(j))) {
                            System.out.println("Yes");
                            return;
                        }
                    }
                }
            }
        }

        // 条件を満たす商品ペアがない場合は "No" を出力
        System.out.println("No");
	}
}