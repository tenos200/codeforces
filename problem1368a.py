t = int(input())

for i in range(t):
    cnt = 1 
    a,b,n = map(int, input().split())
    while a+b <= n:
        if a>b:
            b+=a
        else:
            a+=b
        cnt+=1
    print(cnt)
