// Multiple of 2 and N

package abc.ABC102.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// Nと2の最小公倍数を求める
		int LCM = N % 2 == 0 ? N : 2 * N;
		
		System.out.println(LCM);
	}
}

/* 三項演算子について

<条件式> ? <trueのときの値> : <falseのときの値> の形式で記述する。

int LCM = N % 2 == 0 ? N : 2 * N;

は以下を三項演算子を用いて置き換えたもの。

int LCM = 0;
if (N % 2 == 0) {
    LCM = N;
} else {
    LCM = 2 * N;
}

*/
