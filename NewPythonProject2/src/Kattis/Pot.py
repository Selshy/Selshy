n = int(input())
result = 0
for _ in range (n):
    p = input()
    last = int(p[-1])
    p1 = int(int(p) / 10)
    result += p1**last
print(result)
