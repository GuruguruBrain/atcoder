# Counting Ls

def count_triplets_efficient(N, S):
    count = 0

    # 各行、各列に'o'がいくつあるかを事前に計算する
    row_count = [0] * N
    col_count = [0] * N
    for i in range(N):
        for j in range(N):
            if S[i][j] == 'o':
                row_count[i] += 1
                col_count[j] += 1

    # 条件を満たす三組を数える
    for i in range(N):
        for j in range(N):
            if S[i][j] == 'o':
                # 同じ行または列にある他の'o'の数から、現在のマスを引く
                count += (row_count[i] - 1) * (col_count[j] - 1)

    return count

N = int(input())
S = [input() for _ in range(N)]

result = count_triplets_efficient(N, S)
print(result)