# Repunit Trio

def find_nth_repunit_sum(n):
    # 12桁までのレピュニットを生成
    repunits = [int('1' * i) for i in range(1, 13)]
    sums = set()

    # すべての可能な3つのレピュニットの和を計算
    for i in repunits:
        for j in repunits:
            for k in repunits:
                sums.add(i + j + k)

    # 和を小さい順に並べ替えてn番目の数を返す
    sorted_sums = sorted(list(sums))
    return sorted_sums[n - 1]

input_number = int(input())

result = find_nth_repunit_sum(input_number)
print(result)