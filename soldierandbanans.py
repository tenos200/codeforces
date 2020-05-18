k, n, w = map(int, input().split())
tot = 0
for i in range(w + 1):
    tot += k * i 

if tot - n <= 0:
    print(0)
else:
    print(tot - n)

