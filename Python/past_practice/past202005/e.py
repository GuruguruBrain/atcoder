# Sprinklers

''' 隣接行列を使った解法
N, M, Q = map(int, input().split())

# False の N * N の二次元配列を作る
graph = []
for i in range(0, N):
    
    # 長さ N の False の 1 次元配列を作る
    row = []
    for j in range(0, N):
        row.append(False)
        
    # 長さ N の False の 1 次元配列を graph に追加する
    graph.append(row)

# M 本の辺を受け取る
for i in range(0, M):
    u, v = map(int, input().split())
    
    # 頂点番号は全て -1 する
    u -= 1
    v -= 1
    
    # u と v の間には辺があるため True にする
    graph[u][v] = True
    graph[v][u] = True

# 頂点の色のリストを受け取る
C = list(map(int, input().split()))

# Q 個のクエリを受け取る
for i in range(0, Q):
    query = list(map(int, input().split()))
    
    # スプリンクラーを起動するクエリの場合
    if query[0] == 1:
        x = query[1]
        
        # 頂点番号は全て -1 する
        x -= 1
        
        # 頂点 x の色を出力する
        print(C[x])
        
        # 全ての頂点を順番に見る
        for i in range(0, N):
            
            # 頂点 i が頂点 x に隣接しているとき、
            # すなわち頂点 x と頂点 i の間に辺があるとき
            if graph[x][i]:
                
                # 頂点 i の色を C[x] に書き換える
                C[i] = C[x]

    # スプリンクラーを起動しないクエリの場合
    if query[0] == 2:
        x = query[1]
        y = query[2]
        
        # 頂点番号は全て -1 する
        x -= 1
        
        # 頂点 x の色を出力する
        print(C[x])
        
        # 頂点 x の色を y に書き換える
        C[x] = y
'''



''' 隣接リストを使った解法 '''
N, M, Q = map(int, input().split())

# N * 0 の 2 次元配列を作る
graph = []

for i in range(0, N):
    # 長さ 0 の 1 次元配列を作る
    row = []
    graph.append(row)

# M 本の辺を受け取る
for i in range(0, M):
    u, v = map(int, input().split())
    
    # 頂点番号は全て -1 する
    u -= 1
    v -= 1
    
    # 頂点 u から v へ辺がある
    graph[u].append(v)
    
    # 頂点 v から u へ辺がある
    graph[v].append(u)
    
# 頂点の色のリストを受け取る
C = list(map(int, input().split()))

# Q 個のクエリを受け取る
for i in range(0, Q):
    query = list(map(int, input().split()))
    
    # スプリンクラーを起動するクエリの場合
    if query[0] == 1:
        x = query[1]
        
        # 頂点番号は全て -1 する
        x -= 1
        
        # 頂点 x の色を出力する
        print(C[x])
        
        # 頂点 x に隣接する頂点の色を頂点 x と同じ色にする
        for i in graph[x]:
            C[i] = C[x]

    # スプリンクラーを起動しないクエリの場合
    if query[0] == 2:
        x = query[1]
        y = query[2]
        
        # 頂点番号は全て -1 する
        x -= 1
        
        # 頂点 x の色を出力する
        print(C[x])
        
        # 頂点 x の色を y に書き換える
        C[x] = y