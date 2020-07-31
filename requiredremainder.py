t = int(input())

for i in range(t):

    res = 0
    x, y, n = map(int, input().split())

    if(int(n - n % x + y) <= n):
        res = int(n - n % x + y) 

    else:
        res = int(n - n % x - (x - y)) 

    print(res)

