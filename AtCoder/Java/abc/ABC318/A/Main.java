// Full Moon

package abc.ABC318.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int P = sc.nextInt();
		int result = 0;

		if (N < M) {
			System.out.println(result);
		} else {
			int num = M;
			while (num <= N) {
				num += P;
				result++;
			}
			System.out.println(result);
		}
	}
}