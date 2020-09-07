n = list(map(int, input().split()))
s = input()
cnt = 0

for i in s:

    if i == '1':
        cnt+=n[0]
    if i == '2':
        cnt+=n[1]
    if i == '3':
        cnt+=n[2]
    if i == '4':
        cnt+=n[3]

print(cnt)
