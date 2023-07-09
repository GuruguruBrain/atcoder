// 105

package abc.ABC106.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int total = 0;

		for (int i = 1; i <= N; i+=2) { // 奇数のみを考慮
			int divisors = 0;
			for (int j = 1; j <= i; j++) { // iの約数を探す
				if (i % j == 0) {
					divisors++;
				}
			}
			if (divisors == 8) {
				total++;
			}
		}
		System.out.println(total);			
	}
}