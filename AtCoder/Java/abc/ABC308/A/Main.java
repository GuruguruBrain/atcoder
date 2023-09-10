// New Scheme

package abc.ABC308.A;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[8];
        
        boolean isValid = true;
        
        for (int i = 0; i < 8; i++) {
            S[i] = sc.nextInt();
            
            if (i > 0 && S[i] < S[i - 1]) {
                isValid = false;
                break;
            }
            if (S[i] < 100 || S[i] > 675 || S[i] % 25 != 0) {
                isValid = false;
                break;
            }
        }
        
        System.out.println(isValid ? "Yes" : "No");
    }
}