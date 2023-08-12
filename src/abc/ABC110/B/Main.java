// 1 Dimensional World's Tale

package abc.ABC110.B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		Set<Integer> x = new HashSet<Integer>();
        for (int i = 0; i < N; i++) {
            x.add(sc.nextInt());
        }
        
        Set<Integer> y = new HashSet<Integer>();
        for (int i = 0; i < 3; i++) {
            y.add(sc.nextInt());
        }
		
        boolean isWar = false;
        
        for (int i = 0; i < N; i++) {
        	x.contains(y);
        }
        
	}
}