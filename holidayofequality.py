n = int(input())
cnt = 0
citz = list(map(int, input().split()))

mx = max(citz) 

for i in citz:
    cnt+= mx - i

print(cnt)

