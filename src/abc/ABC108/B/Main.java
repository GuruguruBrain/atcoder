// Ruined Square

package abc.ABC108.B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        // 回転行列を使用
        // 辺のベクトルを計算
        int dx = x2 - x1;
        int dy = y2 - y1;

        // 残りの2点の座標を計算
        int x3 = x2 - dy;
        int y3 = y2 + dx;
        int x4 = x1 - dy;
        int y4 = y1 + dx;
        
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}