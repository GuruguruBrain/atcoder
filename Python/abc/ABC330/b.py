# Minimize Abs 1

N, L, R = map(int, input().split())
A = list(map(int, input().split()))

# 各 A_i に対して最適な X_i を計算する関数
def find_optimal_x(N, L, R, A):
    X = []
    for a in A:
        # L 以上 R 以下で A_i に最も近い整数を見つける
        x = max(L, min(R, a))
        X.append(x)
    return X

X = find_optimal_x(N, L, R, A)

print(" ".join(map(str, X)))