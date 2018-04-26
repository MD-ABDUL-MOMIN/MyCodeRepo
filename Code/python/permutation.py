#!/usr/bin/python3

v = []
p = [0]*100
def gen_per(n):
	if len(v)==n:
		print(v)
	else:
		for i in range(1,n+1):
			if p[i]==1:
				continue
			p[i]=1;
			v.append(i)
			gen_per(n)
			p[i]=0
			v.pop()


print("Please insert an integer for  permutaion (1->n) ")
n = int(input())
gen_per(n)
