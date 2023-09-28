# ゾロ目数

''' 全探索による解法 '''

N = int(input())

# 今までに出てきたゾロ目数の数
z = 0

# 1 から 555555 までの整数をすべて調べる。調べている数を i とする
for i in range(1, 555555 + 1):
    
    # i がゾロ目かどうか調べるために、i を文字列にした si を作る
    si = str(i)
    
    # i がゾロ目かどうかを保存する変数
    ok = True
    
    # si のすべての文字が si の 0 文字目と同じかどうかを調べる
    # si の 0文字目と異なる文字が含まれていたら、i はゾロ目ではない
    for s in si:
        if s != si[0]:
            ok = False
            
    # i がゾロ目のとき、出てきたゾロ目数の数を 1 増やす
    if ok:
        z += 1
    
    # i がゾロ目数で、N 番目に出てきたゾロ目数ならば、答えとして保存する
    if ok and z == N:
        ans = i
      

print(ans)



''' 数学を使った解法

import math

N = int(input())

# N番目のゾロ目数の桁数
x = math.ceil(N / 9)

# N番目のゾロ目数の数字
y = N % 9

if y == 0:
    y = 9

ans = ""

# 答えはyがx桁並んだものとなる
for _ in range(0, x):
    ans += str(y)

print(ans)

'''


''' Javaの場合

import java.util.Scanner;

public class ZoromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        // 今までに出てきたゾロ目数の数
        int z = 0;
        
        // 答えとして保存する変数
        int ans = 0;
        
        // 1 から 555555 までの整数をすべて調べる。
        for (int i = 1; i <= 555555; i++) {
            
            // i がゾロ目かどうか調べるために、i を文字列に変換
            String si = Integer.toString(i);
            
            // i がゾロ目かどうかを保存する変数
            boolean ok = true;
            
            // si のすべての文字が si の 0 文字目と同じかどうかを調べる
            for (char s : si.toCharArray()) {
                if (s != si.charAt(0)) {
                    ok = false;
                    break; // 一つでも違う文字が見つかったらループを抜ける
                }
            }
            
            // i がゾロ目のとき、出てきたゾロ目数の数を 1 増やす
            if (ok) {
                z++;
            }
            
            // i がゾロ目数で、N 番目に出てきたゾロ目数ならば、答えとして保存する
            if (ok && z == N) {
                ans = i;
                break; // N 番目のゾロ目数が見つかったのでループを抜ける
            }
        }
        
        System.out.println(ans);
    }
}

'''