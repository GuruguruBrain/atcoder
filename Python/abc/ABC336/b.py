# CTZ

# 与えられた整数 N の末尾に連続する0の数を計算する関数
def ctz(N):
    count = 0
    while N % 2 == 0:
        N = N // 2
        count += 1
    return count

N = int(input())
result = ctz(N)
print(result)