// MissingNo.

package abc.ABC317.B;

import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++) {
	        A[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(A);
		
		for (int i = 0; i < N; i++) {
			if (A[i] + 1 != A[i+1] && i + 1 < N) {
				System.out.println(A[i] + 1);
				break;
			}
		}
	}
}