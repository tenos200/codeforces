t = int(input())

for i in range(t):

    a, b = map(int, input().split())

    mx = max(a, b)
    mn = min(a, b)
    ans = max(mn * 2, mx) 

    print(ans*ans)



