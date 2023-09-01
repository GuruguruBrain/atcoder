// Default Price

package abc.ABC308.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String C[] = new String[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.next();
		}
		String D[] = new String[M];
		for (int i = 0; i < M; i++) {
			D[i] = sc.next();
		}
		int P[] = new int[M +1];
		for (int i = 0; i < M +1; i++) {
			P[i] = sc.nextInt();
		}

		int colorTotal = 0;
		int notColorTotal = 0;
		// C[i]が探索済みであるか
		boolean explored[] = new boolean[N];

		// 料金表Pにある色Dの合計
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (C[i].equals( D[j])) {
					colorTotal += P[j + 1];
					explored[i] = true; // 探索済みのC[i]である
				}
			}
		}

		// 料金表Pにない色Dの合計
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				// 料金表Pにある色Dでないかつ、探索済みのC[i]でない場合
				if (!C[i].equals( D[j]) && !explored[i]) {
					notColorTotal += P[0];
				}
				break;
			}
		}

		System.out.println(colorTotal + notColorTotal);
	}
}