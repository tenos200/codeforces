c = input()
cards = list(map(str, input().split()))

ans = "NO"

for card in cards:
    if c[0] == card[0] or c[1] == card[1]:
        ans = "YES"
    
print(ans)
