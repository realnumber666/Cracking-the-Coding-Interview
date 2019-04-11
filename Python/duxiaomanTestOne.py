import sys
n = int(sys.stdin.readline().strip())
arr = []

def happy(s):
    if (int(s) == 0):
        return 'G'
    ret = 'S'
    flag = 0
    for j in range(len(s)):
        if (int(s) % int(s[j]) == 0):
            ret = 'H'
        else: 
            flag = 1
    if (ret == 'H' and flag == 0):
        ret = 'G'
    return ret

for i in range(n):
    sysin = sys.stdin.readline().strip()
    arr.append(sysin)

for a in arr:
    print(happy(a))

