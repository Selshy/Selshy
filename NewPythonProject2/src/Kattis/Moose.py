left, right = map(int, input().split())

if left > 0 or right > 0:    
    if left > right:
        print("Odd", left*2)
    elif right > left:
        print("Odd", right*2)
    elif left == right:
        print("Even", left*2)
else:
    print("Not a moose")