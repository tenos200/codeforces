n = int(input())
c = 0
for i in range(n):
    s = input()
    
    if s == "Tetrahedron":
        c += 4 

    if s == "Cube":
        c += 6 

    if s == "Octahedron":
        c += 8 

    if s == "Dodecahedron":
        c += 12 

    if s == "Icosahedron":
        c += 20 

print(c)
