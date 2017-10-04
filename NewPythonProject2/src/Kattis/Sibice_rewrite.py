n, w, h = input().split
n = int(n)
w = int(w)
h = int(h)
w = w**2
h = h**2

for _ in (n):
    l = int(input)
    if L <= math.sqrt(w+h):
        print("DA")
    else:
        print("NE")