# First ABC 2

''' 自分の回答
N = int(input())
S = list(input())

ans = -1

for i in range(N-2):
    if S[i] == 'A' and S[i+1] == 'B' and S[i+2] == 'C':
        ans = (i + 1)
        break
    
print(ans)
'''

''' GPT-4の回答 '''
N = int(input())
S = input()

# ABCがSの中で初めて現れる位置を探す
position = S.find('ABC')

# 出力する
if position != -1:
    print(position + 1)
else:
    print(-1)