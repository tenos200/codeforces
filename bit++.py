n = int(input(""))
x = 0
t = []
for i in range(0, n):
    t.append(input(""))


for j in range(0, len(t)):
    if t[j] == "++X" or t[j] == "X++":
        x+=1
    else:
        x-=1
        
print(x)
