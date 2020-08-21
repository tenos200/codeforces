t = int(input())

for i in range(t):
    
    s = 0
    a, b, c, n = map(int, input().split())
    mx = max(a, max(b, c))
    s = a + b + c + n

    if s % 3 == 0 and s/3 >= mx:
        print("YES")
    else:
        print("NO")





