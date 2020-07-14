t = int(input())

while t > 0:
    sum_1 = 0
    sum_2 = 0
    n = int(input())

    sum_1 = 2 ** n 
    div = int(n/2)

    for i in range(1, div):
        sum_1 += 2 ** i

    for i in range(div, n):
        sum_2 += 2 ** i
    
    print(abs(sum_1 - sum_2))
    t-=1
    
    
