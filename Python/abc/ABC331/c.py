# Sum of Numbers Greater Than Me

def calculate_sum_of_larger_elements(N, A):
    
    # 数列をソート
    sorted_A = sorted(A)
    
    # 累積和を計算
    cum_sum = [0]
    for a in sorted_A:
        cum_sum.append(cum_sum[-1] + a)
        
    # 各要素より大きい要素の和を格納する配列
    ans = []
    
    # 各要素について、それより大きい要素の和を計算
    for i in range(N):
        # ソートされたリストでの位置を見つける
        index = bisect.bisect_right(sorted_A, A[i])
        # 全体の和から、自分より小さいまたは等しい要素の和を引く
        sum_larger = cum_sum[-1] - cum_sum[index]
        ans.append(sum_larger)
        
    return ans

import bisect

N = int(input())
A = list(map(int, input().split()))

print(*calculate_sum_of_larger_elements(N, A))