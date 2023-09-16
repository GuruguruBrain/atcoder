// 1 Dimensional World's Tale

package abc.ABC110.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int x[] = new int[N];
		for (int i = 0; i < N; i++) {
	        x[i] = sc.nextInt();
	    }
        
		int y[] = new int[M];
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

        sc.close();
		
        int maxX = X;
        for (int i = 0; i < N; i++) {
            if (x[i] > maxX) {
                maxX = x[i];
            }
        }
        
        int minY = Y;
        for (int i = 0; i < M; i++) {
            if (y[i] < minY) {
                minY = y[i];
            }
        }
        
        if (maxX < minY) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
        
    }
}