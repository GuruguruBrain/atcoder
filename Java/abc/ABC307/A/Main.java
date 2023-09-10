// Weekly Records

package abc.ABC307.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int oneWeekTotal[] = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 7; j++) {
				oneWeekTotal[i] += sc.nextInt();
			}
			System.out.print(oneWeekTotal[i] + " ");
		}
	}
}