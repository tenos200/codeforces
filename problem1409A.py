t = int(input())
for i in range(t):
    a, b = map(int, input().split())
    d = abs(a - b)
    print(int((d + 9) / 10))

    
