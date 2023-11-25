# Minimize Abs 2

def find_min_difference(D):
    # 最小差を大きな数で初期化
    min_diff = float('inf')
    min_x, min_y = 0, 0  # 最小差を与える x, y の値を記録

    # 可能な x の値について反復処理
    x = 0
    while x**2 <= D:
        # y を計算（y^2 = D - x^2 から導出）
        y_squared = D - x**2

        # y_squared の平方根に最も近い整数を y とする
        y = int(y_squared**0.5)

        # 最小差を求めるために、y の両方の可能な値 (y と y+1) をチェック
        for y_candidate in [y, y + 1]:
            diff = abs(x**2 + y_candidate**2 - D)
            if diff < min_diff:
                min_diff = diff
                min_x, min_y = x, y_candidate  # 最小差を与える x, y を更新

        x += 1

    return min_diff, min_x, min_y

D = int(input())

result = find_min_difference(D)

print(result[0])