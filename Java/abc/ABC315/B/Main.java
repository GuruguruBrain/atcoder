// The Middle Day

package abc.ABC315.B;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D[] = new int[M];

        for (int i = 0; i < M; i++) {
            D[i] = sc.nextInt();
        }
        sc.close();

        int middleDay = 0;
        int sum = 0;

        for (int days : D) {
            sum += days;
        }

        middleDay = (sum + 1) / 2;

        sum = 0;
        int resultMonth = 0;
        int resultDay = 0;

        for (int i = 0; i < D.length; i++) {
            sum += D[i];
            if (sum >= middleDay) {
                resultMonth = i + 1;
                resultDay = D[i] - (sum - middleDay);
                break;
            }
        }

        System.out.println(resultMonth + " " + resultDay);
    }
}