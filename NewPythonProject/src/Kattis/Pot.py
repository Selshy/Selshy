N = raw_input()
X = 0
i = 0
int(N)
for i in (0, N):
    P = raw_input()
    last = P[-1]
    P = int(P)
    last = int(last)
    P = P / 10
    X += P**last
print X