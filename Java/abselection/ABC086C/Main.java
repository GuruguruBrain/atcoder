// Traveling

package abselection.ABC086C;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int preT = 0;
        int preX = 0;
        int preY = 0;

        for (int i = 0; i < N; i++) {
            int postT = sc.nextInt();
            int postX = sc.nextInt();
            int postY = sc.nextInt();

            int dt = postT - preT;
            int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
            if ((dt < dist) || ((dist - dt) % 2 != 0)) {
                System.out.println("No");
                return;
            }
            preT = postT;
            preX = postX;
            preY = postY;
        }
        System.out.println("Yes");
    }
}