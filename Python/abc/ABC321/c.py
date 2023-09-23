# 321-like Searcher

import itertools

# 9から0までの数字のリストを作成（狭義単調減少のための順番）
r = [9,8,7,6,5,4,3,2,1,0]

# 321-like Numberを格納するための空のリスト
t = []

# 1桁から10桁までの数字の組み合わせを考慮して、321-like Numberを生成
for i in range(1,11):
    # 10の数字からi桁の組み合わせをすべて取得
    C = itertools.combinations(range(10),i)
    
    # 各組み合わせを処理
    for c in C:
        # 組み合わせの要素をインデックスとして、リストrから対応する数字を取得
        a = [r[x] for x in c]
        
        # 数字を文字列に変換
        st = [str(x) for x in a]
        
        # 文字列のリストを連結し、整数に変換してリストtに追加
        t.append(int("".join(st)))

t.sort()

k = int(input())

print(t[k])