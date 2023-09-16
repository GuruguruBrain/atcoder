// Order Something Else

package abc.ABC310.A;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int P = sc.nextInt();
    	int Q = sc.nextInt();
    	Integer D[] = new Integer[N];
    	for (int i = 0; i < N; i++) {
    		D[i] = sc.nextInt();
    	}
		sc.close();
    	
    	int min = D[0];
    	
    	for(int j = 1; j < D.length; j++) {
    	    if(min > D[j]) {
    	        min = D[j];
    	    }
    	}
    	
    	if (Q + min < P) {
    		System.out.println(Q + min);    		
    	} else {
    		System.out.println(P);
    	}
    	
	}
}