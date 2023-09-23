# Cutoff

N, X = map(int, input().split())
A = [int(i) for i in input().split()]

# 既に与えられているスコアをソート
A.sort()

for score in range(101):  # Nラウンド目に取得可能なスコアは0~100
    # Nラウンド目のスコアを追加して再ソート
    temp_scores = A + [score]
    temp_scores.sort()

    # 最小スコアと最大スコアを除いた合計を計算
    total = sum(temp_scores[1:-1])

    # X以上になればそのスコアを出力
    if total >= X:
        print(score)
        break
else:
    print(-1)