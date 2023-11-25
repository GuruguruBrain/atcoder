# Counting Passes

N, L = list(map(int, input().split()))
scores = list(map(int, input().split()))

pass_students = sum(score >= L for score in scores)
print(pass_students)