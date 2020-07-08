n = int(input())
m = 0
c = 0

for i in range(n):
    m_dice, c_dice = map(int, input().split())

    if m_dice > c_dice:
        m+=1
    
    if c_dice > m_dice:
        c+=1

if m > c:
    print("Mishka")

if c > m:
    print("Chris")

if c == m:
    print("Friendship is magic!^^")

