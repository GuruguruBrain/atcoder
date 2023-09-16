// Shiritori

package abc.ABC109.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] W = new String[N];
		for(int i = 0; i < N; i++) {
			W[i] = sc.next();
		}
		sc.close();
		
		boolean notShiritori = false;
		
		for (int i = 0; i < W.length; i++) {
			// 文字列の最後の文字と次の文字の頭文字が一致しなかった場合
			if (i + 1 < N && W[i].charAt(W[i].length() - 1) != W[i + 1].charAt(0)) {
				notShiritori = true;
			} else {
				for (int j = 0; j < W.length; j++) {
					// 文字列の重複があった場合
					if (j != i &&W[j].equals(W[i])) {
						notShiritori = true;
					}
				}
			}
		}
		
		if (notShiritori) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}
}



/* HashSetを使った場合( 処理効率： O(N^2) → O(1) )

import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] W = new String[N];
        for(int i = 0; i < N; i++) {
            W[i] = sc.next();
        }

        boolean notShiritori = false;
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < N; i++) {
            if (i > 0 && W[i].charAt(0) != W[i - 1].charAt(W[i - 1].length() - 1)) {
                notShiritori = true;
            }
            if (seen.contains(W[i])) {
                notShiritori = true;
            }
            seen.add(W[i]);
        }

        if (notShiritori) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

*/