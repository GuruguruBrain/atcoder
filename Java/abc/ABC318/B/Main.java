// Overlapping sheets


/* tag
 * グリッド
 * 面積
 * グラフ
 */

package abc.ABC318.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] grid = new int[101][101]; // 0 <= x, y <= 100 なので、101x101のグリッドを用意

		// 各シートで覆われる領域を数え上げる
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			for (int x = A; x < B; x++) {
				for (int y = C; y < D; y++) {
					grid[x][y]++;
				}
			}
		}

		// 1枚以上のシートに覆われている領域の面積を計算
		int S = 0;
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				if (grid[x][y] > 0) {
					S++;
				}
			}
		}

		System.out.println(S);
	}
}