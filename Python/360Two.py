#!/bin/python
# -*- coding: utf8 -*-
import sys
import os
import re

#请完成下面这个函数，实现题目要求的功能
#当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
#******************************开始写代码******************************
'''
1. 通过一个数组对颜色进行计数
2. 数组sort，最小的值应大于1，不然就return 0
3. 最大的值分别被每个比他小的数除，除不尽就return 0
'''
def  main():
    n = int(sys.stdin.readline().strip())
    line = sys.stdin.readline().strip()
    arr = list(map(int, line.split(' ')))
    n_set = [0] * len(arr)
    for a in arr:
    	n_set[a] += 1

    n_set.sort()
    min_a = 0
    for i in n_set:
        if (i != 0 and min_a == 0):
            min_a = i
        if (i == 1):
            return 0
    k = n - 2
    max_a = n_set[n-1]
    while (k >= 0):
        if (n_set[k] == 0):
            k -= 1
            continue
        if (max_a % n_set[k] != 0):
            return 0
        k -= 1

    return int(n / min_a)



#******************************结束写代码******************************


  
res = main()

print(str(res) + "\n")