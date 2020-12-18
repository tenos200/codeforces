t = int(input()) 
for i in range(t):
    n = int(input())
    if int(n % 2 == 1):
        for j in reversed(range(1, n + 1)):
            if j == int(n / 2) + 1:
                print(int(n/2), end=" ")
            elif j == int(n / 2):
                print(int((n/2) + 1), end=" ")
            else:
                print(j, end=" ")
        print()
    else:
        for j in reversed(range(1, n + 1)):
            print(j, end=" ")
        print()
