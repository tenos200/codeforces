m = input()
n = input().split()
p = []

for i in range(1, len(n) + 1):
    a = n.index(str(i))
    a+=1
    p.append(str(a))

print(" ".join(p))
