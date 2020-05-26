s = input()
upper = 0
lower = 0

for i in range(len(s)):
    if ord(s[i]) >= 65 and 90 >= ord(s[i]):
        upper+=1
    else:
        lower+=1

if upper > lower:
    print(s.upper())

else:
    print(s.lower())



