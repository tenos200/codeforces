t = int(input())
for i in range(t):
    n = input()
    ln = len(n)
    dig = int(n[0])
    print(int( 10 * (dig - 1) + ln*(ln + 1)/2))
