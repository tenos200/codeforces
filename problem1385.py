t = int(input())
for i in range(t):

    n = int(input())
    a = list(map(int, input().split()))
    s = set()

    for i in range(n*2):
        if a[i] not in s:
            print(a[i], end=" ")
            s.add(a[i])
    print()
