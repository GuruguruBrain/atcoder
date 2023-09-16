// Default Price

package abc.ABC308.B;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String C[] = new String[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.next();
		}
		String D[] = new String[M];
		for (int i = 0; i < M; i++) {
			D[i] = sc.next();
		}
		int P[] = new int[M +1];
		for (int i = 0; i < M +1; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();

		int colorTotal = 0;
		int notColorTotal = 0;
		// C[i]が探索済みであるか
		boolean explored[] = new boolean[N];

		// 料金表Pにある色Dの合計
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (C[i].equals( D[j])) {
					colorTotal += P[j + 1];
					explored[i] = true; // 探索済みのC[i]である
				}
			}
		}

		// 料金表Pにない色Dの合計
		for (int i = 0; i < N; i++) {
			if (explored[i]) {
				continue;
			}
			for (int j = 0; j < M; j++) {
				// 料金表Pにある色Dでないかつ、探索済みのC[i]でない場合
				if (!C[i].equals(D[j]) && !explored[i]) {
					notColorTotal += P[0];
					explored[i] = true; // このC[i]に対する料金を追加したので探索済みにする
					break;
				}
			}
		}

		System.out.println(colorTotal + notColorTotal);
	}
}


/* GPT-4の回答 
 * O(N * M) → O(N + M)

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nは食べた皿の数、Mは料金表にある色の数
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Cは食べた皿の色の配列
        String[] C = new String[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.next();
        }
        
        // colorToPriceは色と価格をマッピングするHashMap
        HashMap<String, Integer> colorToPrice = new HashMap<>();
        
        // Dは料金表にある色の配列
        String[] D = new String[M];
        for (int i = 0; i < M; i++) {
            D[i] = sc.next();
        }
        
        // P0は料金表にない色の皿の価格
        int P0 = sc.nextInt();
        
        // 料金表にある色と価格をマッピング
        for (int i = 0; i < M; i++) {
            int price = sc.nextInt();
            colorToPrice.put(D[i], price);
        }

        // 合計価格を計算
        int total = 0;
        for (int i = 0; i < N; i++) {
            // getOrDefaultを使って、色が料金表にあればその価格、なければP0を加算
            total += colorToPrice.getOrDefault(C[i], P0);
        }

        // 合計価格を出力
        System.out.println(total);
    }
}

 */