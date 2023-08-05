// Who is Saikyo?

package abc.ABC313.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 強さの関係を表現するグラフを作成
        boolean[][] graph = new boolean[N][N];
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt() - 1;
            int B = sc.nextInt() - 1;
            graph[A][B] = true;
        }

        // 推移律を適用してグラフを更新
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][k] && graph[k][j]) {
                        graph[i][j] = true;
                    }
                }
            }
        }

        // 最強のプログラマーを特定
        int strongestProgrammer = -1;
        for (int i = 0; i < N; i++) {
            boolean isStrongest = true;
            for (int j = 0; j < N; j++) {
                if (i != j && !graph[i][j]) {
                    isStrongest = false;
                    break;
                }
            }
            if (isStrongest) {
                if (strongestProgrammer != -1) {
                    // 最強のプログラマーが複数人いる場合
                    strongestProgrammer = -1;
                    break;
                }
                strongestProgrammer = i + 1;
            }
        }

        System.out.println(strongestProgrammer);
    }
}