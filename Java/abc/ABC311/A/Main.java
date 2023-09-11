// First ABC

package abc.ABC311.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String arrS[] = S.split("");
		
		boolean A = false;
		boolean B = false;
		boolean C = false;
		
		for(int i = 0; i < N; i++) {
			if(arrS[i].equals("A")) {
				A = true;
			} else if(arrS[i].equals("B")) {
				B = true;
			} else if(arrS[i].equals("C")){
				C = true;
			}
			if(A == true && B == true && C == true) {
				System.out.println(i + 1);
				break;
			}
		}
			
	}
}



/* charAt()を使えばメモリ節約できる

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		boolean A = false;
		boolean B = false;
		boolean C = false;
		
		for(int i = 0; i < N; i++) {
			char ch = S.charAt(i);
			if(ch == 'A') {
				A = true;
			} else if(ch == 'B') {
				B = true;
			} else if(ch == 'C'){
				C = true;
			}
			if(A && B && C) {
				System.out.println(i + 1);
				break;
			}
		}		
	}
}

*/