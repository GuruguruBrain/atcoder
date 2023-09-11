package tmptools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdinLibrary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 空白区切りで入力を受け取る
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String u = sc.next();

		// N個の配列をdN個入力
		int N = sc.nextInt();
		Integer d[] = new Integer[N];
		for (int i = 0; i < N; i++) {
	        d[i] = sc.nextInt();
	    }

		// 3つの数字をリストに格納
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(sc.nextInt());
        }

		// 文字列を分割して配列に格納
		String arrS[] = s.split("");
		String arrT[] = t.split("");

		// 標準入力された文字列を１文字ずつ取り出す
		String[] strArray = s.split("");
		for(String s2 : strArray) {
		}

		// Nとaの最小公倍数を求める
		int LCM = N % a == 0 ? N : a * N;

		// charAt(最後の文字) + substring(最初～最後-1の文字)で文字列を回転
        s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);


	}
}