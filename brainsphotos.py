n, n2 = map(int, input().split(" ")) 
ans = "#Black&White" 

for i in range(n):
  s = list(map(str, input().split())) 
  for i in s:
    if i == "Y" or i == "C" or i ==  "M":

print(ans) 
