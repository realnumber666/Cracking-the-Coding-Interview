import sys

m = int(sys.stdin.readline().strip())
arr = []
for j in range(m):
    line = str(sys.stdin.readline().strip())
    arr.append(line)
T = str(sys.stdin.readline().strip())

time = 0
def delStr(str, index, length):
    arr = list(str)
    del(arr[index:index+length])
    return ''.join(arr)

for i in arr:
    res = T.find(i)
    while(res != -1):
        T = delStr(T, res, len(i))
        time += 1
        res = T.find(i)
        # print(T)
print(time)

