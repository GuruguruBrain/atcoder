// Cakes and Donuts

package abc.ABC105.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		boolean flg = false;
		
		// 全探索
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				if (i * 4 + j * 7 == N) {
					flg = true;
					break;
				}
			}
			if (flg) {
				break;
			}
		}
		
		if (flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}


/* Refactoring by GPT-4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String res = "No";
        
        // 全探索
        for (int i = 0; i * 4 <= N; i++) {
            if ((N - i * 4) % 7 == 0) {
                res = "Yes";
                break;
            }
        }
        
        System.out.println(res);
    }
}

*/