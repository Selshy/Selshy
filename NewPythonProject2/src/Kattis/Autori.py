n = input()
x = int(len(n))
result = ""
for a in range (0, x):
    if n[a].isupper():
        result += n[a]
print(result)