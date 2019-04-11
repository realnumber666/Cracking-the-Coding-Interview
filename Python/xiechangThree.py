import sys
sysin = sys.stdin.readline().strip().split()
n = int(sysin[0])
arr = [None]*n

for i in range(n):
    path = sysin[i+1]
    path_arr = path.split('/')
    del path_arr[0]
    for j in range(len(path_arr)):
        path_arr[j] = [path_arr[j], 1]
    arr[i] = path_arr
print(arr)
tol_str = '1'*len(arr[0])
print(len(arr))
flag = 0
# TODO: 次数更新到全局变量的数组！！
for k in range(1, len(arr)):
    t = k-1
    while(t>=0 and flag == 0):
        stri = ' '
        f = arr[t]
        p = arr[k]
        if(len(p) != len(f)): # 首先选一遍长度，都不相同则退出；中间有长度相同的开始匹配，匹配不上再往前
            stri += '1'*(len(p))
            t -= 1
            if(t == -1):
                tol_str += stri
            continue
        else:
            for a in range(0, len(p)):
                content = p[a][0]
                if(content == f[a][0]):
                    if(a == (len(p)-1) or a == 0):
                        stri += '1'
                        t -= 1
                        if(a == (len(p)-1)):
                            tol_str += stri
                            if(k == (len(arr)-1)):
                                flag = 1
                        continue
                    stri = stri + str(f[a][1]+1)
                else:
                    stri += '1'*len(p)
                    t -= 1
                    tol_str += stri
                    break

print(tol_str)