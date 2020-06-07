n = int(input())
home = []
away = []
count = 0

for i in range(n):
    x, y = input().split(" ")
    home.append(x)
    away.append(y)

for i in home:
    if i in away:
        count += away.count(i)

print(count)
