package tmptools;

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
		
		// 標準入力された文字列を１文字ずつ取り出す
		String[] strArray = s.split("");
		for(String s2 : strArray) {
		}
		
		// Nとaの最小公倍数を求める
		int LCM = N % a == 0 ? N : a * N;
		
		
	}
}