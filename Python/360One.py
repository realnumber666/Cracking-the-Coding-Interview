#!/bin/python
# -*- coding: utf8 -*-
import sys
import os
import re

#请完成下面这个函数，实现题目要求的功能
#当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
#******************************开始写代码******************************
'''
1. 从左开始遍历字符，第一个是0则抛弃，读到小数点则break
2. 如果出现了非数字或长度为一，且字符为0，则返回0
'''

def  string2int(str):
    flag = 0
    if (len(str) == 0):
        return 0
    ret = 0
    if (len(str) == 1 and str[0] == '0'):
        return 0
    if (str[0] == '.'):
        return 0
    for i in range(len(str)):           
        if (str[i] == '.'):
            flag = 1    
            continue    
        k = char2int(str[i])
        if (k == 'f'):
            return 0
        elif (flag == 0):
            ret = ret * 10 + k
        else:
            ret = ret
    return ret


def char2int(char):
    if (char == '0' or char == '1' or char == '2' or char == '3' or char == '4' or char == '5' or char == '6' or char == '7' or char == '8' or char == '9'):
        return int(char)
    else:
        return 'f'

#******************************结束写代码******************************


try:
    _str = input()
except:
    _str = None

  
res = string2int(_str)

print(str(res) + "\n")