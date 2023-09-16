// Longest Palindrome

package abc.ABC320.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int result = 1;

        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                if (isPalindrome(S.substring(i, j))){
                    if (j - i > result) {
                        result = j - i;
                    }
                }
            }
        }
        System.out.println(result);
	}

    public static boolean isPalindrome(String sentence) {
        int minIdx = 0;
        int maxIdx = sentence.length() - 1;
 
        while(minIdx < maxIdx) {
            if(sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {
                return false;
            }
        }
        return true;
    }
}