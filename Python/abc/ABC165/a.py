# We Love Golf

''' A から B まで全探索する解法 '''
K = int(input())
A, B = map(int, input().split())

OK = False

for x in range(A, B + 1):
    if x % K ==0:
        OK = True

if OK:     
    print('OK')
else:
    print('NG')



''' K の倍数を全探索する解法
K = int(input())
A, B = map(int, input().split())

OK = False

for i in range(0, 10000000000):
    if i * K > B:
        break
        
    if A <= i * K <= B:
        ok == True

if OK:     
    print('OK')
else:
    print('NG')
'''



'''数学的な解法
K = int(input())
A, B = map(int, input().split())

OK = False

x = A // K
u = B // K

# x < u ならば K の倍数が A 以上 B 以下の範囲の中にある
if x < u:
    ok = True
    
if A % K == 0:
    ok = True

if OK:     
    print('OK')
else:
    print('NG')
'''