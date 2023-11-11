# Not Too Hard

N, X = map(int, input().split())
S = list(map(int, input().split()))

# 配点が X 以下の問題の配点を合計する
total_score = 0
for i in range(N):
    if S[i] <= X:
        total_score += S[i]

print(total_score)