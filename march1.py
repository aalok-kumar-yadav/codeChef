from itertools import combinations
from math import log10


T=input()
result=[-1]*T

if(T>=1):
	count=0
	while(count<T):
		N,M = raw_input().split()
		N = int(N)
		M = int(M)

		if(N>=0 and N<=20):
			arr=[0]*N
			for i in range(N):
				val=input()
				if(val>=0 and val<=1000):
					arr[i]=val
				else:
					break

			flag =False
			for j in range(N):
				comb=combinations(arr,j+1)
				length=0
				
				for k in list(comb):
					sum=0
					for m in range(j+1):
						sum=sum+k[m]
		
		
					if(sum==M):
						flag=True
					  	break

				if(flag==True):
					result[count]=1
					break
				else:
					result[count]=0	
			if(N==0 and M!=0):
				result[count]=0	


		count=count+1

	for a in range(T):
		if(result[a]==1):
			print "Yes"
		elif(result[a]==0):
			print "No"	
		
