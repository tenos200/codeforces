n = int(input(""))



for i in range(0, n):
    s = str(input(""))
    if len(s) > 10:
        print(str(s[0]) + str(len(s)-2) + str(s[-1]))
    else:
        print(s)


