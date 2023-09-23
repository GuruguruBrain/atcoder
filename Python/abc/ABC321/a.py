# 321-like Checker

num = int(input())

n = [int(a) for a in str(num)]

likenumber = True

for i in range(len(n) - 1):
    if n[i] <= n[i+1]:
        likenumber = False
        break

if likenumber:
    print("Yes")
else:
    print("No")