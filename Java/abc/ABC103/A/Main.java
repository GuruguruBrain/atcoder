// Task Scheduling Problem

package abc.ABC103.A;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for(int i=0; i<3; i++){
            A[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(A);
        int minCost = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        System.out.println(minCost);
    }
}