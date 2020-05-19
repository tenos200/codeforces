n = int(input())
tram = 0
res = 0
for i in range(n):
    exiting, entering = map(int, input().split())

    tram -= exiting 
    tram += entering

    if tram > res:
        res = tram


print(res)
