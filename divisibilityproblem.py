n = int(input())

for i in range(n):
    a, b  = input().split()

    if int(a) % int(b) == 0:
        print(0)
    else:
        print(int(b) - int(a) % int(b))

