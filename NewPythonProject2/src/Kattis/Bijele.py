a = 1
b = 2
c = 8
a = int(a)
b = int(b)
c = int(c)

k, q, r, bi, kn, p = input().split()
k = int(k)
q = int(q)
r = int(r)
bi = int(bi)
kn = int(kn)
p = int(p)

if k != a:
    k = a - k
else:
    k = 0

if q != a:
    q = a - q
else:
    q = 0

if r != b:
    r = b - r
else:
    r = 0

if bi != b:
    bi = b - bi
else:
    bi = 0

if kn != b:
    kn = b - kn
else:
    kn = 0

if p != c:
    p = c - p
else:
    p = 0
print(k, q, r, bi, kn, p)