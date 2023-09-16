// Chord

package abc.ABC312.A;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("ACE", "BDF", "CEG", "DFA", "EGB", "FAC", "GBD"));
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		if (set.contains(S)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}