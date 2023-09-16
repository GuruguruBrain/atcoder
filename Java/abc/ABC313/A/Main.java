// To Be Saikyo

package abc.ABC313.A;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        sc.close();

        int max = 0;
        int result = 0;
        
        for (int i = 1; i < N; i++) {
            if (P[i] > max) {
                max = P[i];
            }
        }

        if (P[0] <= max) {
            result = max - P[0] + 1;
        }

        System.out.println(result);
    }
}