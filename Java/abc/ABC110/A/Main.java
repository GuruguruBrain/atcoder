// Maximize the Formula

package abc.ABC110.A;

import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] ary = new Integer[3];
		for (int i = 0; i < 3; i++) {
	        ary[i] = sc.nextInt();
	    }
        sc.close();
		Arrays.sort(ary);
		System.out.println((ary[2] * 10) + ary[1] + ary[0]);
	}
}

/* other answer

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 3つの数字をリストに格納
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(sc.nextInt());
        }
        
        // 降順にソート
        Collections.sort(numbers, Collections.reverseOrder());
        
        // 最大のお小遣いを計算
        int maxAllowance = numbers.get(0) * 10 + numbers.get(1) + numbers.get(2);
        
        System.out.println(maxAllowance);
    }
}

*/