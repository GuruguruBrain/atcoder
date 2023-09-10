// tcdr

/* tag
 * 
 * 文字連結
 * 文字削除
 * 
 */

package abc.ABC315.A;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder result = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}