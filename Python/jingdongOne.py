import sys
n = int(sys.stdin.readline().strip())
tol_arr = []
line = sys.stdin.readline().strip()
arr = list(map(int, line.split(' ')))
num = arr[0]
time = 0

for i in range(n-1):
    line = sys.stdin.readline().strip()
    arr = list(map(int, line.split(' ')))
    tol_arr.append(arr)
    if (arr[1] == num):
        time += 1
        num = arr[0]
    else:
        break
def maxLen(index):
    num = index
    equal = []
    time = 0
    for j in range(len(tol_arr)):
        now = tol_arr[j]
        if (now[1] == num):
            time += 1
            num = now[0]

    length = length + max(maxLen(), )
    return length

print(time+2)
