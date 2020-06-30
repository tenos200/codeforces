t = int(input())

while(t > 0):

    n = int(input())
    half = int(n / 2)

    if n % 4 != 0:
        print("NO")

    else:
        print("YES")

        for i in range(1, half + 1):
            print(f'{i * 2} ' , end="")

        for i in range(1, half):
            print(f'{i * 2 - 1} ' , end="")

        print(f'{3 * half - 1} ', end="")
        print()
        
    t-=1


