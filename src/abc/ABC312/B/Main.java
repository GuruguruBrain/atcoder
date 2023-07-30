// TaK Code

/* tag
 * マス目
 */

package abc.ABC312.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 次の行のためにScannerを進める
        sc.nextLine();
        
        char[][] table = new char[N][M];

        // 各マスの色を読み取り、白マスだけの行または列があるかどうかをチェックする
        for (int i = 0; i < N; i++) {
        	String s = sc.nextLine();
        	for (int j = 0; j < M; j++) {
        		table[i][j] = s.charAt(j);
        		// 左上の TaK Code 判定
        		if (
        				// 左上及び右下の縦 3 マス横 3 マスの領域に含まれる計 18 マスは全て黒である
        				table[i][j] == '#' && table[i][j + 1] == '#' && table[i][j + 2] == '#' &&
        				table[i + 1][j] == '#' && table[i + 1][j + 1] == '#' && table[i + 1][j + 2] == '#' &&
        				table[i + 2][j] == '#' && table[i + 2][j + 1] == '#' && table[i + 2][j + 2] == '#' &&
        				table[i][j] == '#' && table[i][j + 1] == '#' && table[i][j + 2] == '#' &&
        				table[i + 1][j] == '#' && table[i + 1][j + 1] == '#' && table[i + 1][j + 2] == '#' &&
        				table[i + 2][j] == '#' && table[i + 2][j + 1] == '#' && table[i + 2][j + 2] == '#' &&
        				// 左上及び右下の縦 3 マス 横 3 マスの領域に八方位で隣接する計 14 マスは全て白である
        				table[i][j] == '.' && table[i][j + 1] == '.' && table[i][j + 2] == '.' &&
        				table[i + 2][j] == '.' && table[i + 2][j + 1] == '.' && table[i + 2][j + 2] == '.' &&
        				table[i + 2][j] == '.' && table[i + 2][j + 1] == '.' && table[i + 2][j + 2] == '.' &&
        				table[i + 2][j] == '.' && table[i + 2][j + 1] == '.' && table[i + 2][j + 2] == '.' &&
        				table[i + 2][j] == '.' && table[i + 2][j + 1] == '.' && table[i + 2][j + 2] == '.' &&
        				table[i + 2][j] == '.' && table[i + 2][j + 1] == '.' && table[i + 2][j + 2] == '.' &&
        				table[i + 2][j] == '.' && table[i + 2][j + 1] == '.' && table[i + 2][j + 2] == '.') {
        			System.out.println(table[i][j] + " " + table[][]);
        		}
        	}
        }
    }
}