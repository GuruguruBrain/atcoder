// Train

package abc.ABC107.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = sc.nextInt();
		sc.close();		
		System.out.println(N - i + 1);
	}
}