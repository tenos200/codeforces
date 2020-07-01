k, r = map(int, input().split())

for i in range(1, 100):

    if k * i % 10 == 0:
        print(i)
        break

    if k * i % 10 == r:
        print(i)
        break
