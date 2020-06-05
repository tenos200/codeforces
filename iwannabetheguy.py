n = int(input())
x = list(map(int, input().split()))
y = list(map(int, input().split()))

x.pop(0)
y.pop(0)

myset = set(x + y)

if n == len(myset):
    print("I become the guy.")

else:
    print("Oh, my keyboard!")
