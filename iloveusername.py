n = int(input())
contests = list(map(int, input().split()))
mx = contests[0]
mn = contests[0]
count = 0

for i in range(0, n):
    if contests[i] > mx:
        mx = contests[i]
        count+=1

    if contests[i] < mn:
        mn = contests[i]
        count+=1

print(count)





