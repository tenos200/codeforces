t = int(input())
for i in range(t):
    n, m = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    pos = False
    for j in range(n):
        if(a[j] in b):
            p = j
            pos = True
            break
    if(pos):
        print("YES")
        print(f'1 {a[p]}')
    else:
        print("NO")
