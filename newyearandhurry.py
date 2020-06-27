n, k = map(int, input().split())
count = 0
sm = k

for i in range(1, n + 1):
    sm +=i*5
    if sm > 240:
        break
    count+=1

print(count)

