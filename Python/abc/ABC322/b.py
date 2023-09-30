# Prefix and Suffix

N, M = map(int, input().split())
S = list(input())
T = list(input())

ans = 3

if T[:N] == S:
    ans = 1

if  T[-N:] == S:
    ans = 2

if T[:N] == S and T[-N:] == S:
    ans = 0

print(ans)