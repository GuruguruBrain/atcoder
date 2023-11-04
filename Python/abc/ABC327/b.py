# A^A

B = int(input().strip())
A = 1

# A^A が B 以下の間、ループを続ける
while A ** A <= B:
    # A^A が B と同じ場合、その A を出力してループを終了する
    if A ** A == B:
        print(A)
        break
    A += 1
else:
    print(-1)



''' TLE
import math

B = int(input().strip())

# B の平方根以下の整数で、A^A = B となるものを見つける
for A in range(1, int(math.sqrt(B))+1):
    if A ** A == B:
        print(A)
        break
else:
    print(-1)
'''