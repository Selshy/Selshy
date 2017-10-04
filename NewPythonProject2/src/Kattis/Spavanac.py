h, m = input().split()
h = int(h)
m = int(m)
m = m - 45
if m < 0:
    h = h - 1
    m = 60 + m
if h == -1:
    h = 23
print(h, m)