//Some Sums

package abselection.ABC083B;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
 
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int n = i;
            int digSum = 0;
            while (n > 0) {
                digSum += n % 10;
                n /= 10;
            }
            if (digSum >= A && digSum <= B)
                sum += i;
        }
        System.out.println(sum);
    }
}