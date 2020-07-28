t = int(input())

for i in range(t):
    
    n = int(input())
    nums = list(map(int, input().split()))

    res = max(nums)
    nums.sort()

    for i in range(n):
        for j in range(1+i, n):
            res = min(res, nums[j] - nums[i])

    print(res)
