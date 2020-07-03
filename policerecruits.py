n = int(input())
rec = 0
cnt = 0
crimes = list(map(int, input().split()))

for i in crimes:

    if i == -1:
        if rec > 0:
            rec-=1
        else:
            cnt+=1
    else:
        rec+=i

print(cnt)


