//Kagami Mochi

//My answer
package abselection.ABC085B;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer d[] = new Integer[N];
		for (int i = 0; i < N; i++) {
	        d[i] = sc.nextInt();
	    }
		sc.close();
		Arrays.sort(d, Comparator.reverseOrder());
		
		int kagamiMochi = 1; // 最初のMochiをカウント
		
		for (int i = 0; i < N - 1; i++) { // i < N - 1 で範囲外アクセスを避ける
			if (d[i] > d[i + 1]) { // 高さが異なるMochiのみをカウント
				kagamiMochi += 1;
			}
		}
		System.out.println(kagamiMochi);
	}
}


/* Model answer

package abselection.ABC085B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> d = new HashSet<>();
		for (int i = 0; i < N; i++) {
	        d.add(sc.nextInt());
	    }
		System.out.println(d.size());
	}
}

*/