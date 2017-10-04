n, w, h = input()
n = int(n)
w = int(w)
h = int(h)
hypothenuse = math.sqrt(w**2 + h**2)
for _ in range (n):
    a = int(input)
    if a < hypothenuse:
        print("DA")
    else:
        print("NE")