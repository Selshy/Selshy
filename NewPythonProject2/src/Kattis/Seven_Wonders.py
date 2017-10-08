t, c, g=[0]*3
string = input()
size = len(string)
for i in range(size):
    if string[i] == "T":
        t += 1
    elif string[i] == "C":
        c += 1
    else:
        g += 1
n = t
if c < n:
    n = c
if g < n:
    n = g
print(t**2 + c**2 + g**2 + n*7)
