s = input()
a = set()

for i in range(len(s)):
    if ord(s[i]) >= 97 and ord(s[i]) <= 122:
        a.update(s[i])
        
print(len(a))
