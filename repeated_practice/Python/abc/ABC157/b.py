# Bingo

A = [list(map(int, input().split())) for _ in range(3)]
N = int(input())
b = [int(input()) for _ in range(N)]

# ビンゴカードの各要素がマークされたかどうかを追跡する配列
bingo = [[False for _ in range(3)] for _ in range(3)]

# ビンゴカード上の数字を確認し、対応する位置をマーク
for num in b:
    for i in range(3):
        for j in range(3):
            if A[i][j] == num:
                bingo[i][j] = True

# ビンゴがあるかどうかをチェック
bingo_found = False
for i in range(3):
    if all(bingo[i]) or all(bingo[j][i] for j in range(3)):
        bingo_found = True
if (bingo[0][0] and bingo[1][1] and bingo[2][2]) or (bingo[0][2] and bingo[1][1] and bingo[2][0]):
    bingo_found = True

# 結果を出力
if bingo_found:
    print('Yes')
else:
    print('No')