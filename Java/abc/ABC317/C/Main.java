// Remembering the Days

/* 
 * 
 * 深さ優先探索(DFS)
 * 
 */

package abc.ABC317.C;

import java.util.Scanner;

class Main {
    static int N, M;
    static int[][] roads;  // 街iと街jをつなぐ道路の長さ
    static boolean[] visited;  // 街iを訪れたか
    static int maxDistance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        roads = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            roads[A][B] = C;
            roads[B][A] = C;  // 道路は双方向のため逆も保存
        }
        sc.close();

        // 各街から探索を開始
        for (int i = 1; i <= N; i++) {
            visited[i] = true;  // 現在の街を訪れたとマーク
            dfs(i, 0);  // 現在の街からDFSを開始
            visited[i] = false;  // 探索が終わったら訪れたマークを解除
        }

        System.out.println(maxDistance);  // 最大距離を出力
    }

    public static void dfs(int current, int distance) {

        maxDistance = Math.max(maxDistance, distance);

        // 未訪問の隣接街に移動
        for (int j = 1; j <= N; j++) {
            // 街jが未訪問で、かつ現在いる街(current)から街jへの道路が存在する場合
            if (!visited[j] && roads[current][j] > 0) {
                visited[j] = true;  // jを訪れたとマーク
                dfs(j, distance + roads[current][j]);  // dfs再帰呼び出し(jへ移動し、距離を更新)
                visited[j] = false;
            }
        }
    }
}