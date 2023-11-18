# Count xxx

N = int(input())
S = str(input())

# S に含まれる異なる文字の種類を取得
wordtype = list(set(S))

# 各文字について、その文字からなる最長の部分文字列の長さを保持する辞書
maxwordlong = {wordtype[i]: 0 for i in range(len(wordtype))}

# 最初の文字を一時的な文字列 (tmp) として設定し、前の文字 (pre) としても記録
tmp = S[0]
pre = S[0]

ans = 1

# 文字列の長さが1ではない場合の処理
if len(S) != 1:
    maxwordlong[tmp] = 1
    for s in S[1:]:
        # 現在の文字が前の文字と同じ場合、tmp を延長
        if s == pre:
            tmp = tmp + s
        else:
            # 異なる文字が出現した場合、tmp と pre を更新
            tmp = s
            pre = s

        # tmp の長さを計算
        tmplong = len(tmp)

        # 現在の文字に対応する最長部分文字列の長さを更新し、ans を増やす
        if maxwordlong[s] < tmplong:
            maxwordlong[s] = tmplong
            ans += 1

print(ans)



''' 公式の模範解答

import collections
import itertools

N = int(input())
S = input()

# 各文字の最長連続出現回数を格納する辞書
d = collections.defaultdict(int)

# 文字列 S をグループ化し、各グループに対して処理を行う
for c, g in itertools.groupby(S):
    # 各文字について、現在の最長連続回数と新たに見つかった連続回数の大きい方を辞書に保存
    d[c] = max(d[c], len(list(g)))

print(sum(d.values()))

'''