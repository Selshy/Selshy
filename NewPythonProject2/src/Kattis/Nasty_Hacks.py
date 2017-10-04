n = int(input())
for _ in range(n):
    r, e, c = input().split()
    r = int(r)
    e = int(e)
    c = int(c)
    if r < e-c:
        print("advertise")
    elif r == e-c:
        print("does not matter")
    else:
        print("do not advertise")