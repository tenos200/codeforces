w, y = map(int, input().split())
m = max(w, y)
outcomes = ["0/1", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"]
print(outcomes[m])
