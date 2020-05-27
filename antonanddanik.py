n = int(input())
s = input()

a = s.count("A")
d = s.count("D")

if a == d:
    print("Friendship")

if d > a:
    print("Danik")

if a > d:
    print("Anton")

