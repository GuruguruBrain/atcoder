// String Rotation

package abc.ABC103.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		S += S;
		if (S.contains(T)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

/* other answer

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        String T = scanner.next();

        for (int i = 0; i < S.length(); i++) {
            if (S.equals(T)) {
                System.out.println("Yes");
                return;
            }
            // charAt(最後の文字) + substring(最初～最後-1の文字)で文字列を回転
            S = S.charAt(S.length() - 1) + S.substring(0, S.length() - 1);
        }
        System.out.println("No");
    }
}


*/