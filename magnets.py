n = int(input())

groups = 0 

last_magnet = "00"

for i in range(n):
    a = input()

    if x != last_magnet:
        groups+=1
        last_magnet = x

print(groups)
