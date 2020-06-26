t = int(input())

for i in range(t):
    power = 1
    l = []
    n = int(input())
    
    while n > 0:
        if n % 10 > 0:
            l.append(int((n % 10) * power))

        n = int(n / 10)
        power*=10

    print(len(l))
    for i in l:
        print(i, end=" ")
    print()

