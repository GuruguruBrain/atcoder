// Grid Compression

package abc.ABC107.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 行数Hと列数Wを読み込む
        int H = sc.nextInt();
        int W = sc.nextInt();
        
        // 次の行のためにScannerを進める
        sc.nextLine();
        
        // マスの色を保持する二次元配列と、
        // 白マスだけからなる行または列を判定するための配列を準備する
        char[][] a = new char[H][W];
        boolean[] row = new boolean[H];
        boolean[] column = new boolean[W];

        // 各マスの色を読み取り、白マスだけの行または列があるかどうかをチェックする
        for (int i = 0; i < H; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < W; j++) {
                a[i][j] = s.charAt(j);
                // そのマスが黒なら、その行と列は白マスだけではない
                if (a[i][j] == '#') {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // 白マスだけの行と列を除外して、マス目を出力する
        for (int i = 0; i < H; i++) {
            // その行が白マスだけではない場合に限り、その行を出力する
            if (row[i]) {
                for (int j = 0; j < W; j++) {
                    // その列が白マスだけではない場合に限り、そのマスを出力する
                    if (column[j]) {
                        System.out.print(a[i][j]);
                    }
                }
                // 行の出力を終えたら、改行する
                System.out.println();
            }
        }
    }
}