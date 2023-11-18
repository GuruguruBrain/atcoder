# Election Quick Report

N, M = map(int, input().split())
votes = list(map(int, input().split()))

# 各候補者の得票数を格納するリスト
vote_counts = [0] * (N + 1)

# 最大得票数
max_votes = 0

# 現在の勝者
current_winner = 0

# 各票について処理する
for i in range(M):
    # 票を追加
    candidate = votes[i]
    vote_counts[candidate] += 1

    # 最大得票数と現在の勝者を更新
    # 現在の候補者が最も多くの票を獲得しているか、または得票数が同数の場合には番号が最も小さい候補者を選ぶ
    if vote_counts[candidate] > max_votes or (vote_counts[candidate] == max_votes and candidate < current_winner):
        max_votes = vote_counts[candidate]
        current_winner = candidate

    # 現在の勝者を出力
    print(current_winner)