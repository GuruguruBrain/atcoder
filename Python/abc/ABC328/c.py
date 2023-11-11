'''
# 累積和
'''

# Consecutive

N, Q = map(int, input().split())
S = input()
queries = [tuple(map(int, input().split())) for _ in range(Q)]

# 同じ英小文字が隣り合う箇所の数を事前に数える関数
def preprocess(S):
    
    # 隣接する同じ文字のペアの累積数を格納するリスト
    count_pairs = [0]

    # 文字列 S の各文字に対してループを行う
    for i in range(1, len(S)):
        # 現在の文字が前の文字と同じであれば1を加算し、異なれば0を加算
        # count_pairs[-1] は直前の文字までの累積ペア数
        count_pairs.append(count_pairs[-1] + (S[i - 1] == S[i]))
    return count_pairs

# 文字列 S に関して事前計算を行う
count_pairs = preprocess(S)

results = []

for l, r in queries:
    # l から r までの間の隣接する同じ文字のペアの数を計算
    results.append(count_pairs[r - 1] - count_pairs[l - 1])

for result in results:
    print(result)



''' TLEとなった回答
# 同じ英小文字が隣り合う箇所の数を数える関数
def count_adjacent_pairs(S, queries):
    results = []
    # 各質問に対してループ
    for l, r in queries:
        # 隣り合う同じ文字のペアの数をカウント
        count = 0
        # 質問の範囲内でループ
        for i in range(l, r):
             # 隣接する文字が同じかどうかをチェック
            if S[i - 1] == S[i]:
                count += 1
        results.append(count)
    return results

N, Q = map(int, input().split())
S = input()
queries = [tuple(map(int, input().split())) for _ in range(Q)]

results = count_adjacent_pairs(S, queries)
for result in results:
    print(result)
'''