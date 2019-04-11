import sys

line = sys.stdin.readline().strip()
line = line.replace('[', '')
line = line.replace(']', '')
k = int(sys.stdin.readline().strip())
arr = list(map(int, line.split(',')))
length = len(arr)
n = length // k
i = 0
if(n == 0):
    print(str(arr).replace(' ', ''))
else:
    for i in range(n):
        print(i)
        t = i*k
        l = t
        r = t+k-1
        while(r-abs(l) >= 1):
            arr[r], arr[l] = arr[l], arr[r]
            r -= 1
            l += 1
    print(str(arr).replace(' ', ''))