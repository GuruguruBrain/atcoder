// Nine
package abc.ABC309.A;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // AとBの位置を特定するための変数
        int ax = -1, ay = -1, bx = -1, by = -1;

        // AとBの位置を見つける
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == A) {
                    ax = i;
                    ay = j;
                }
                if (table[i][j] == B) {
                    bx = i;
                    by = j;
                }
            }
        }
        
        // AとBが同じ行に存在し、かつ列の差が1である場合、"Yes"を出力
        if (ax == bx && Math.abs(ay - by) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}