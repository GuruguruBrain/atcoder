# Pentagon

def are_segments_equal(s1, s2, t1, t2):
    # 正五角形の各頂点間の距離を格納する辞書
    distance_map = {
        'A': {'B': 1, 'C': 2, 'D': 2, 'E': 1},
        'B': {'A': 1, 'C': 1, 'D': 2, 'E': 2},
        'C': {'A': 2, 'B': 1, 'D': 1, 'E': 2},
        'D': {'A': 2, 'B': 2, 'C': 1, 'E': 1},
        'E': {'A': 1, 'B': 2, 'C': 2, 'D': 1}
    }

    length_s1s2 = distance_map[s1][s2]
    length_t1t2 = distance_map[t1][t2]

    return 'Yes' if length_s1s2 == length_t1t2 else 'No'

s1s2 = input().strip()
t1t2 = input().strip()

s1, s2 = s1s2[0], s1s2[1]
t1, t2 = t1t2[0], t1t2[1]

result = are_segments_equal(s1, s2, t1, t2)
print(result)