// Digit Sums
/*
 * et al. https://www.techiedelight.com/ja/calculate-sum-elements-list-java/
 */

// My answer
package abc.ABC101.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		Integer i = N;
		
		List<Integer> list = new ArrayList<>();
		
		while (i > 0) {
			list.add(i % 10);
			i /= 10;
		}
		
		// リスト内のすべての要素の合計を計算
		int S = list.stream().mapToInt(Integer::intValue).sum();
		
		if (N % S == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}


/* Model answer
 * リスト使わなくても一時変数でよい

package abc.ABC101.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int temp = N;
        int sum = 0;
        
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (N % sum == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

 */