nums = list(map(int, input().split()))
nums.sort()
x4 = nums[3]
print(f"{x4 - nums[0]} {x4 - nums[1]} {x4 - nums[2]}")
