# Bingo

A = []
for _ in range(0, 3):
    row = list(map(int, input().split()))
    A.append(row)

M = []
for i in range(0, 3):
    row = []
    for j in range(0, 3):
        row.append(False)
    M.append(row)

N = int(input())
for _ in range(0, N):
    b = int(input())
    for i in range(0, 3):
        for j in range(0, 3):
            if A[i][j] == b:
                M[i][j] =True

bingo = False
for i in range(0, 3):
    for j in range(0, 3):
        # 横一列が揃った場合
        if M[i][0] and M[i][1] and M[i][2]:
            bingo = True
        # 縦一列が揃った場合
        if M[0][j] and M[1][j] and M[2][j]:
            bingo = True
        # 斜めに揃った場合
        elif (M[0][0] and M[1][1] and M[2][2]) or (M[0][2] and M[1][1] and [2][0]):
            bingo = True
            
if bingo:
    print("Yes")
else:
    print("No")