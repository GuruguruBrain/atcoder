// Leyland Number

package abc.ABC320.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((int)(Math.pow(A, B) + Math.pow(B, A)));
	}
}