// Rated for Me

package abc.ABC104.A;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int R = sc.nextInt();
    	if (R < 1200) {
    		System.out.println("ABC");
    	} else if (R < 2800) {
    		System.out.println("ARC");
    	} else {
    		System.out.println("AGC");
    	}
    }
}

/* 三項演算子を使用した場合

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        System.out.println(R < 1200 ? "ABC" : R < 2800 ? "ARC" : "AGC");
    }
}

*/