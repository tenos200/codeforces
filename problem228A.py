n = list(map(int, input().split()))
count = 0
n.sort()

for i in range(1, 4):
    if n[i] == n[i-1]:
        count+=1

print(count)
