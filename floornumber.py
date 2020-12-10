t = int(input())
for i in range(t):
    n, x = map(int, input().split())
    if n <= 2:
        print(1)
    else:
        print(int((n-3)/x) + 2)

