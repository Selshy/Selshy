n = input()
x = 0
for i in (0, n):
    p = input()
    last = int(str(p[-1]))
    x += p**last
print x