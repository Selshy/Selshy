x = int(input())
n = int(input())
a = 0
for _ in range(n):
    p = int(input())
    a += x-p
print(a + x)    