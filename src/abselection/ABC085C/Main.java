// Otoshidama

// My answer
package abselection.ABC085C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        
        int[] qty = {-1, -1, -1};
        
        for (int a = 0; a <= N; a++) {
            for (int b = 0; b <= N - a; b++) {
                int c = N - a - b;
                if (c >= 0 && a * 10000 + b * 5000 + c * 1000 == Y) {
                    qty[0] = a;
                    qty[1] = b;
                    qty[2] = c;
                    break;
                }
            }
            if (qty[0] != -1) break;
        }
        System.out.println(qty[0] + " " + qty[1] + " " + qty[2]);
    }
}


// Model answer
/*


package abselection.ABC085C;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int a=0; a<=N; a++) {
            for (int b=0; b<=N-a; b++) {
                int c = N - a - b;
                int total = a * 10000 + b * 5000 + c * 1000;
                if (total == Y) {
                    System.out.println(a + " " + b + " " + c);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
}

*/