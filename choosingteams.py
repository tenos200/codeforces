n, k = map(int, input().split())
nums = list(map(int, input().split()))
cnt = 0

for i in nums:
    if(5 - i >= k):
        cnt+=1

print(int(cnt / 3))
