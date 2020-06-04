n = int(input())
drinks = list(map(float, input().split()))
Res = 0

for i in range(n):

    res += drinks[i] / n

print(res)



