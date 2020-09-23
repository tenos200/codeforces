n = int(input())
l = []
cnt = 0
for i in range(n):
    s = input()
    if "OO" in s and cnt < 1:
        l.append(s.replace("OO", "++", 1))
        cnt+=1
    else:
        l.append(s)
if cnt == 1:
    print("YES")
    for i in l:
        print(i)
else:
    print("NO")


