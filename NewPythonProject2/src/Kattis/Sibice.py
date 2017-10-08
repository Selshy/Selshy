import math
n, w, h = map(int, input().split())
w2 = w**2
h2 = h**2

for _ in range (n):
    l = int(input())
    if l <= math.sqrt(w2+h2):
        print("DA")
    else:
        print("NE")
