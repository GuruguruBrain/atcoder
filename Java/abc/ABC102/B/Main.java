// Maximum Difference

package abc.ABC102.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			int v = a[i];
			if (v > max) {
				max = v;
			}
			if (v < min) {
				min = v;
			}
		}
		System.out.println(max - min);
	}
}