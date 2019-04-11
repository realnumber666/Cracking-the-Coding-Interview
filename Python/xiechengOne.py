import sys

line = sys.stdin.readline().strip()
arr = list(map(str, line.split(',')))
print(arr)
char_set = [0]*300
flag = 0
for i in range(len(arr)):
    c = ord(arr[i])
    if(char_set[c] == 1):
        print('true')
        flag = 1
    char_set[c] = 1
if(flag == 0):
    print('false')
