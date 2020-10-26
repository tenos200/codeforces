s = input()
alp = 26
cnt = 0
tmp = ord('a')
for i in s:
    cnt+= min(abs(ord(i) - tmp), alp-abs(ord(i) - tmp))
    tmp = ord(i)
print(cnt)
