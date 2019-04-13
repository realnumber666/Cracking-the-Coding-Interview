import sys

## 这天，阳阳和他的小伙伴们一起玩游戏！

## 他们总共有n个人，排成一圈，然后从第一个人开始依次报数，1，2，3，....,报到m的人退出游戏，然后从下一个人开始重新从1报数，重复这个过程，直到只剩下一个人时，此人就是游戏的获胜者
class Node:
    def __init__(self,cargo = None, next = None):
        self.cargo = cargo
        self.next = next
    def __str__(self):
        return str(self.cargo)

line = sys.stdin.readline().strip()
arr = list(map(int, line.split(' ')))
m, n = arr[0], arr[1]
head = Node(1)
now = head
for i in range(1, m):
    temp = Node(i+1)
    now.next = temp
    now = temp
now.next = head
now = head
stri = ''
while(now.next.cargo != now.cargo):
    for j in range(n-1):
        now = now.next
    stri += str(now.cargo)
    stri += ' '
    now.cargo = now.next.cargo
    now.next = now.next.next
print(stri.rstrip())
print(now.cargo)