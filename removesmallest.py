t = int(input())

for i in range(t):

    ans = "YES" 

    n = int(input())
    nums = list(map(int, input().split()))
    nums.sort()

    for i in range(1, n):
        if nums[i] - nums[i-1] > 1:
            ans = "NO"

    print(ans)










    
