n = input()
n2 = input()

s = ""

for i in range(len(n)):
    if n[i] != n2[i]:
        s = s + "1" 
    else:
        s = s + "0"
        
print(s)
