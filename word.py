s = input()
upper = 0
lower = 0

for i in range(len(s)):
    if int(chr(s)) >= 65 and 90 <= int(chr(s)):
        upper+=1
    else:
        lower+=1

if upper == lower:
    print(s.lower())

if upper > lower:
    print(s.upper())

if lower > upper:
    print(s.lower())



