n = int(input())
nums = list(map(int, input().split()))

max_index = nums.index(max(nums))
min_index = nums.index(min(nums))

for i in range(n):
    if nums[min_index] == nums[i]:
        min_index = i


if max_index > min_index:
    print((max_index - 1) + (n - min_index) - 1)

else:
    print((max_index - 1) + (n - min_index))

