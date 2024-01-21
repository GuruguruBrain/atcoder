# Even Digits

def find_good_integer(N):
    num = N - 1
    good_integer = 0
    # 10進数での各桁の位置を表すための乗数
    multiplier = 1
    while num > 0:
        # num % 5 は、5進数における最下位の桁を取得する
        # この値に2を掛けることで、対応する偶数（0, 2, 4, 6, 8）を得る
        good_integer += (num % 5) * 2 * multiplier
        # numを5で割って、次の桁に移動します
        num //= 5
        # 10進数で次の桁に移るために、乗数を10倍にする
        multiplier *= 10
    return good_integer

N = int(input())
result = find_good_integer(N)
print(result)



''' TLE
def find_good_integer(N):
    count = 0
    num = 0
    while count < N:
        if all(digit in '02468' for digit in str(num)):
            count += 1
        num += 1
    return num - 1

N = int(input())
result = find_good_integer(N)
print(result)
'''