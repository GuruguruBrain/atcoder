// TaK Code

/* tag
 * マス目
 */

package abc.ABC312.B;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		char[][] grid = new char[N][M];
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < M; j++) {
				grid[i][j] = line.charAt(j);
			}
		}

		// TaK Codeのパターンを定義
		char[][] takCode = new char[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if ((i < 3 && j < 3) || (i >= 6 && j >= 6)) {
					takCode[i][j] = '#';
				} else if ((i < 3 && j >= 6) || (i >= 6 && j < 3)) {
					takCode[i][j] = '.';
				} else {
					takCode[i][j] = '?';
				}
			}
		}

		// グリッド内の全ての9x9領域をチェック
		for (int i = 0; i <= N - 9; i++) {
			for (int j = 0; j <= M - 9; j++) {
				if (isTaKCode(grid, takCode, i, j)) {
					System.out.println((i + 1) + " " + (j + 1));
				}
			}
		}
	}

	// 与えられた領域がTaK Codeのパターンに一致するかチェック
	private static boolean isTaKCode(char[][] grid, char[][] takCode, int x, int y) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (takCode[i][j] != '?' && grid[x + i][y + j] != takCode[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}