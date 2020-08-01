t = int(input())

for i in range(t):
    a = 0
    b = 0
    n = int(input())
    arr = list(map(int, input().split()))
    
    for i in range(n):

        if arr[i] % 2 != i % 2:
            if(i % 2 == 0):
                a+=1
            else:
                b+=1
    if a != b:
        print(-1)
    else:
        print(b)



