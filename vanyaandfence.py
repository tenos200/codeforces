n, h = map(int, input().split())
f = list(map(int, input().split()))
res = 0

for i in range(n):
    if f[i] <= h:
        res += 1
    else:
        res += 2

print(res)
    
