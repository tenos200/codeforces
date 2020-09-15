t = int(input())
for i in range(t):
    odd = 0
    even = 0
    tot = 0
    input()
    a = list(map(int, input().split()))
    for i in a:
        if i % 2 != 0:
            odd+=1
        else:
            even+=1
        tot+=i
    if (tot % 2 != 0) or (odd >= 1 and even >= 1):
        print("YES")
    else:
        print("NO")



