import sys

line = sys.stdin.readline().strip()
arr = list(map(int, line.split(' ')))
n, k, m = arr[0], arr[1], arr[2]

if (m >= n):
    print(k)
else:
    if (n*k%m == 0):
        print(int(n*k/m))
    else:
        print(int(n*k//m+1))