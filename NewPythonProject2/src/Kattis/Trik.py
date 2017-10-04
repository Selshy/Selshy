a = input()
b = int(len(a))
result = 1
for c in range (0, b):
    if a[c] == 'A':
        if result == 1:
            result = 2
        elif result == 2:
            result = 1
    if a[c] == 'B':
        if result == 2:
            result = 3
        elif result == 3:
            result = 2
    if a[c] == 'C':
        if result == 1:
            result = 3
        elif a[c] == 'C':
            result = 1
print (result)
