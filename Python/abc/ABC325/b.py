# World Meeting

def max_attendance(N, offices):
    max_attendees = 0

    # 24時間のそれぞれについてチェック
    for hour in range(24):
        current_attendees = 0
        for office in offices:
            W, X = office

            # 各オフィスのローカル時間を計算
            local_time_start = (hour + X) % 24
            local_time_end = (local_time_start + 1) % 24

            # 会議がオフィスの業務時間内に開催されるかを確認
            if 9 <= local_time_start < 18 and 9 < local_time_end <= 18:
                current_attendees += W

        # もし現在の時間帯での参加者数がこれまでの最大数を超えたら、それを新しい最大数とする
        max_attendees = max(max_attendees, current_attendees)

    return max_attendees

N = int(input())
offices = [tuple(map(int, input().split())) for _ in range(N)]

result = max_attendance(N, offices)
print(result)