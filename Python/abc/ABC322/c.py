# Festival

''' TLE
N, M = map(int, input().split())
A = list(map(int, input().split()))

# 花火が上がる日を示すboolean型のリストを作成
fireworks = [False] * (N+1)
for day in A:
    fireworks[day] = True

# 各日について次の花火が上がる日を探す
for i in range(1, N+1):
    j = i
    while j <= N and not fireworks[j]:
        j += 1
    print(j - i)
'''

N, M = map(int, input().split())
A = list(map(int, input().split()))

# 現在注目している花火が上がる日を追跡するための変数
count = 0

# 各日に対して
for i in range(1, N+1):
    
    # もし、i日目に花火が上がらない場合
    if i < A[count]:
        # その日から次に花火が上がる日までの日数を計算して出力
        print(A[count] - i)
    
    # もし、i日目に花火が上がる場合
    elif i == A[count]:
        # その日から花火が上がるまでの日数（実際には0）を出力
        print(A[count] - i)
        
        # 次の花火が上がる日に移動
        count += 1