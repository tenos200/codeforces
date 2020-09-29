cnt = 0
n = int(input())
s1 = input()
s2 = input()
for i in range(n):
    cnt += min(abs(int(s1[i]) - int(s2[i])), (10 - abs(int(s1[i]) - int(s2[i]))))
print(cnt)



