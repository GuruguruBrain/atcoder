// Eating Symbols Easy

package abc.ABC101.A;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String S = sc.next();
		
		int num = 0;
		
		String[] strArray = S.split("");
		for(String s : strArray) {
			if (s.equals("+")) {
				num++;
			} else {
				num--;
			}
		}
		System.out.println(num);
	}
}

// 三項演算子を使った場合
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
		
        int num = 0;
		
        for (char c : S.toCharArray()) {
            num += (c == '+') ? 1 : -1;
        }
        System.out.println(num);
    }
}

*/
