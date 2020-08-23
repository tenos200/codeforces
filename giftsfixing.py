t = int(input())

for i in range(t):
    ans = 0
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    mnA = min(a)
    mnB = min(b)

    for i in range(n):
        ans += max(a[i] - mnA, b[i] - mnB)

    print(ans)
