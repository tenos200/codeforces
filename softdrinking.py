n, k, l, c, d, p, nl, np = map(int, input().split())
cnt = int( (k*l) / nl)
cnt1 = c * d
cnt2 = int(p / np); 
min_v= min(cnt, cnt1, cnt2)
print(int(min_v / n))
