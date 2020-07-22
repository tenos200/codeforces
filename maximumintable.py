n = int(input())
ans = [[x for x in range(n)] for y in range(n)]

for row in range(n):
    for col in range(n): 
        if row == 0:
            ans[row][col] = 1
        elif col == 0:
            ans[row][col] = 1
        else:
            ans[row][col] = ans[row-1][col] + ans[row][col-1]

print(ans[-1][-1])

