n = int(input())
l = 0
r = n - 1
cnt = 0
s = 0
d = 0
a = list(map(int, input().split()))
while l <= r:
    pick = 0

    if (a[l] > a[r]):
        pick = a[l]
        l+=1
    else:
        pick = a[r]
        r-=1
    if cnt % 2 == 0:
        s+=pick
    else:
        d+=pick
    cnt+=1
print(f'{s} {d}')



