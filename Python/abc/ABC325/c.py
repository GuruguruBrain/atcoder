# Sensors

def dfs(grid, i, j, H, W):
    # 現在のセルを訪問済みにする (センサーがあるセルを '.' に変更)
    grid[i][j] = '.'

    # 現在のセルから上下左右斜めに移動可能な全てのセルをチェック
    for x in [-1, 0, 1]:
        for y in [-1, 0, 1]:
            ni, nj = i + x, j + y

            # 新しいセルがグリッド内にあり、センサーが存在する場合はDFSを再帰的に呼び出す
            if 0 <= ni < H and 0 <= nj < W and grid[ni][nj] == '#':
                dfs(grid, ni, nj, H, W)


def connected_sensors(grid, H, W):
    # 連動するセンサーのグループの数
    count = 0

    # グリッドの各セルに対してDFSを実行
    for i in range(H):
        for j in range(W):
            if grid[i][j] == '#':
                # 未訪問のセンサーを発見した場合、新しいグループを発見したとみなし、DFSを開始
                dfs(grid, i, j, H, W)
                count += 1

    return count


# 入力
H, W = map(int, input().split())
grid = [list(input()) for _ in range(H)]

# 出力
print(connected_sensors(grid, H, W))
