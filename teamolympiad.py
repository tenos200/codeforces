n = int(input())
kids = list(map(int, input().split()))
prog = []
math = []
pe = []

for i in range(n):
    if kids[i] == 1:
        prog.append(i+1)
    if kids[i] == 2:
        math.append(i+1)
    if kids[i] == 3:
        pe.append(i+1)

teams = min(min(len(prog), len(math)), len(pe))
print(teams)

for i in range(teams):
    print(f"{prog[i]} {math[i]} {pe[i]}")




