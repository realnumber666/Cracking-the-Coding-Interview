import sys
# arr1[0] arr2[1] 逐个比较，找到arr1中父节点相同的，且颜色都是0，且父节点颜色为1的个数，求和

# 先在arr2里找颜色为1的，去找它的子节点，子节点颜色都为0，则tol_res += 子节点个数
# 一旦有一个颜色不是0，直接跳出循环

n = int(sys.stdin.readline().strip())
tol_res = 1
line = sys.stdin.readline().strip()
arr1 = list(map(int, line.split(' ')))
line = sys.stdin.readline().strip()
arr2 = list(map(int, line.split(' ')))
black_dad = []
for i in range(n):
    dad = arr2[i]
    if (dad == 1):
        black_dad.append(i)


# 对于每一个为黑色的dad判断它的孩子是否为白色
# 全为白色则tol_res+孩子数      
for j in range(len(black_dad)):
    cur_dad = black_dad[j]
    s_num = 0
    for k in range(len(arr1)):
    	if (arr1[k] == cur_dad):
            s_num += 1
            if (arr2[k+1] != 0):
                s_num = 1
                break
    if (s_num != 1 and s_num != 0):
        tol_res *= s_num

print(tol_res%1000000007)