# Tomorrow

def next_day(M, D, y, m, d):
    # 日付を1日進める
    d += 1

    # 月の最終日を超えた場合、月を進める
    if d > D:
        d = 1
        m += 1

        # 年の最終月を超えた場合、年を進める
        if m > M:
            m = 1
            y += 1

    return y, m, d

M, D = map(int, input().split())
y, m, d = map(int, input().split())

# 翌日を計算
next_day_year, next_day_month, next_day = next_day(M, D, y, m, d)

print(next_day_year, next_day_month, next_day)