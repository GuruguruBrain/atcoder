# Number Place

def is_valid(arr):
    return set(arr) == set(range(1, 10))

def check_sudoku(matrix):
    # 各行が 1 から 9 までの数字を含むか確認
    for row in matrix:
        if not is_valid(row):
            return False

    # 各列が 1 から 9 までの数字を含むか確認
    for j in range(9):
        if not is_valid([matrix[i][j] for i in range(9)]):
            return False

    # 3×3 のブロックごとに 1 から 9 までの数字を含むか確認
    for i in range(0, 9, 3):
        for j in range(0, 9, 3):
            block = [matrix[x][y] for x in range(i, i + 3) for y in range(j, j + 3)]
            if not is_valid(block):
                return False

    return True

matrix = [list(map(int, input().split())) for _ in range(9)]

if check_sudoku(matrix):
    print("Yes")
else:
    print("No")