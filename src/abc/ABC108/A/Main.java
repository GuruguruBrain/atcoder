// Pair

package abc.ABC108.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int odd = 0;
		int even = 0;
		
		for (int i = 1; i <= K; i++) {
			if (i % 2 != 0) {
				odd++;
			} else {
				even++;
			}
		}
		System.out.println(odd * even);
	}
}
