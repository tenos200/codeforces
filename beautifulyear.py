y = int(input())

while True:
    
    y += 1
    year = str(y)
    
    a = year[0]
    b = year[1]
    c = year[2]
    d = year[3]


    if a != b and a != c and a != d and b != c and c != d and b != d:
        print(y)
        break;
    



    
