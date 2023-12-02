# Buy One Carton of Milk

def min_cost_to_buy_eggs(N, S, M, L):
    # 卵の数ごとの最小コストを計算するための配列を初期化
    # 初期値は無限大 (float('inf')) で、卵の数が N + 12 以上の場合を考慮して、N + 12 + 1 の長さで配列を作成
    min_cost = [float('inf')] * (N + 12 + 1)

    # 0個の卵を買う場合、コストは0
    min_cost[0] = 0

    # 各数の卵に対する最小コストを動的に計算する
    # i個の卵を買う場合の最小コストは、i-6個、i-8個、i-12個の卵を買う場合の最小コストにそれぞれパックの価格を加えたもの
    for i in range(N + 12):
        if i + 6 < len(min_cost):
            min_cost[i + 6] = min(min_cost[i + 6], min_cost[i] + S)
        if i + 8 < len(min_cost):
            min_cost[i + 8] = min(min_cost[i + 8], min_cost[i] + M)
        if i + 12 < len(min_cost):
            min_cost[i + 12] = min(min_cost[i + 12], min_cost[i] + L)

    # N個以上の卵を買うために必要な最小コストを返す
    # min_cost 配列の N 番目の要素から最後の要素までの最小値
    return min(min_cost[N:])

N, S, M, L = map(int, input().split())

print(min_cost_to_buy_eggs(N, S, M, L))