// Potions

package abc.ABC317.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H = sc.nextInt();
		int X = sc.nextInt();
		int P[] = new int[N];
		for (int i = 0; i < N; i++) {
	        P[i] = sc.nextInt();
	    }
		
		for (int i = 0; i < N; i++) {
			if (H + P[i] >= X) {
				System.out.println(i + 1);
				break;
			}
		}
		
	}
}