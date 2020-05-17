for i in range(0, 5):
    nums = list(map(int, input().split()))
    for j in range(0, 5):
        if nums[j] == 1:
            print(abs(i - 2) + abs(j - 2))
            break



