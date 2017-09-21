X = input()
N = input()
Result = 0
for i in range(0, N):
    P = input()
    Result += X - P
    i+= 1
Result += X
print Result
    