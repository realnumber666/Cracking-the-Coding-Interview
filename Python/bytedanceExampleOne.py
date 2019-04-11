import sys
n = int(sys.stdin.readline().strip())

line = sys.stdin.readline().strip()
user = list(map(int, line.split(' ')))

q = int(sys.stdin.readline().strip())
tol_ret = []
for index in range(q):
    line = sys.stdin.readline().strip()
    find = list(map(int, line.split(' ')))
    l = find[0]
    r = find[1]
    k = find[2]
    ret = 0
    for i in range(l-1, r):
        if (user[i] == k):
            ret += 1
    tol_ret.append(ret)

for each in tol_ret:
    print(each)
