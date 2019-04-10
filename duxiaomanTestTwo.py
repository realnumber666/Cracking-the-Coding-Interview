import sys
n = int(sys.stdin.readline().strip())

line = sys.stdin.readline().strip()
arr = list(map(int, line.split(' ')))
flag = 0
l = 0
time = 0
res = 0

def cal(l, r):
    ret = 0
    length = r-l+1
    for u in range(length//2):
        ret += (arr[r+u] - arr[l-u])
    return ret
t = 1
if (arr[0] < arr[1]):
    t = 0
for i in range(t, n):
    k = arr[i]
    if (i == (n-1)):
        res += cal(l, i)
        time += 1
        break
    if(k > arr[i+1]):
        flag = 1
        r = i
        res += cal(l, r)
        time += 1
        continue
    else:
        if(flag == 1):
            l = k
        r = k

print(res, time)