// AtCoder Crackers

package abc.ABC105.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		if (N % K == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}