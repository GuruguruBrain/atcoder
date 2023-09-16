// Roulette

package abc.ABC314.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 各人の賭けた目の情報
		List<int[]> bets = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int C = sc.nextInt(); // 人i
			int[] betNumbers = new int[C]; // 人iが賭けた目
			for (int j = 0; j < C; j++) {
				betNumbers[j] = sc.nextInt(); // 賭けた目を読み込む
			}
			bets.add(betNumbers); // この人の賭けた目の情報をリストに追加
		}
		int X = sc.nextInt();
		sc.close();
		
		// 賭けた目の個数が最も少ない人の賭けた目の個数
		int minBets = Integer.MAX_VALUE;
		
		// 出目Xに賭けた人たちの番号
		List<Integer> winners = new ArrayList<>();
		
		// 各人について、出目Xに賭けているかどうかを調べる
		for (int i = 0; i < N; i++) {
			int[] betNumbers = bets.get(i);
			if (contains(betNumbers, X)) { // この人がXに賭けている場合
				if (betNumbers.length < minBets) { // これまでの最小よりも賭けた目の個数が少ない場合
					minBets = betNumbers.length;
					winners.clear(); // これまでの人たちの情報をクリア
					winners.add(i + 1); // この人の番号をリストに追加
				} else if (betNumbers.length == minBets) { // これまでの最小と同じ賭けた目の個数の場合
					winners.add(i + 1); // この人の番号をリストに追加
				}
			}
		}
		
		System.out.println(winners.size()); // 出目Xに賭けた人たちの数
		for (int winner : winners) {
			System.out.print(winner + " "); // 出目Xに賭けた人たちの番号
		}
		
	}
	
	// 配列にXの値が含まれているかどうかを調べるメソッド
	private static boolean contains(int[] array, int value) {
		for (int num : array) {
			if (num == value) {
				return true;
			}
		}
		return false;
	}
	
}