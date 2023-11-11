# 11/11

N = int(input())
D = list(map(int, input().split()))

# ゾロ目の日数
count = 0

# 各月の日数を順に調べ、ゾロ目の日があればカウントを増やす
for i in range(N):
    for j in range(1, D[i] + 1):
        # iとjを文字列に変換し、ユニークで管理
        digits = set(str(i + 1) + str(j))
        # 集合の要素数が1の場合、ゾロ目の日とみなす
        if len(digits) == 1:
            count += 1

print(count)