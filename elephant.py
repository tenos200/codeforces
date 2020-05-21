x = int(input(""))
count = 0
steps = [5, 4, 3, 2, 1]

for i in range(len(steps)):
    if x >= steps[i]:
        count = count + (x / int(steps[i]))
        x = x % steps[i]

print(int(count))
    
