t = int(input())

for i in range(t):

    n, m = map(int, input().split())
    print(min(2, n-1) * m)
