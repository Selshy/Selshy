for _ in range (10):
    n = int(input())
    if n == -1:
        break
    result = 0
    c = 0
    for _ in range(n):
        a, b = input().split()
        a = int(a)
        b = int(b)
        result += (a * (b-c))
        c = b
    print(result, "miles")