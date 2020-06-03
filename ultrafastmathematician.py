n = input()
n2 = input()

s = [] 

for i in range(len(n)):
    if n[i] != n2[i]:
        s.append("1")
    else:
        s.append("0")
        
print("".join(s))
