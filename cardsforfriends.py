t = int(input())
for i in range(t):
    res = 1
    w, h, n = map(int, input().split())
    while w % 2 == 0:
        w/=2
        res*=2
    while h % 2 == 0:
        h/=2
        res*=2
    if res >= n:
        print("YES")
    else:
        print("NO")


