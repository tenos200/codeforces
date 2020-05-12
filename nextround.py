n, k = map(int, input().split(" "))
numList = list(map(int, input().split(" ")))

count = 0

for i in numList:
    if i > 0 and i >= numList[k-1]:
         count +=1


print(count)



