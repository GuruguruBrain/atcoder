# Next

def second_largest(numbers):
    # 数列をソート
    sorted_numbers = sorted(numbers, reverse=True)
    # 最大値を取得
    max_number = sorted_numbers[0]

    # 最大値でない最大値を探す
    for number in sorted_numbers:
        if number != max_number:
            return number

N = int(input())
numbers = list(map(int, input().split()))

print(second_largest(numbers))