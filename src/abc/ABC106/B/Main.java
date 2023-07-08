// 105

package abc.ABC106.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int total = 0;
		
		for (int i = 0; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (N % j == 0) {
					sum++;
					if (sum == 8) {
						total++;
					}
				}
			}
			
		}
		System.out.println(total);			
	}
}