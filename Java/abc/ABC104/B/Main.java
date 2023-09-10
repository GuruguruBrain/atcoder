// AcCepted

package abc.ABC104.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        // 指定の範囲の文字列を取得
        String partialS = S.substring(2, S.length() - 1);

        // A で始まり、指定の範囲に C が一つだけ含まれ、
        // A と C を除いた文字列がすべて小文字であることを確認
        if (S.startsWith("A") && countC(partialS, 'C') == 1 && isLower(S.replace("A", "").replace("C", ""))) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }

    // 指定した文字が文字列に何回出現するかをカウント
     private static int countC(String source, char target) {
        int count = 0;
        for (char c : source.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    // 文字列がすべて小文字かどうかを確認
    private static boolean isLower(String source) {
        for (char c : source.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}