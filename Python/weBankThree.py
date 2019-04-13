import sys

t = int(sys.stdin.readline().strip())
line = sys.stdin.readline().strip()
n = list(map(int, line.split(' ')))

for i in range(t):
    res = 0
    now = n[i]
    while(now != 1):
        if (now == 1):
            print(res)
            break
        else:
            if (now%2 == 1):
                res += 1
                now = now*3+1
            else:
                res += 1
                now = now/2
    if (int(now) == 1):
        print(res)
    else:
        print(-1)


