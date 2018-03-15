T = input()
result =[None]*T

if(T>=1 and T<=100):
	count = 0
	while (count<T):
		N=input()
		target=input()
		if(N>=1 and N<=20):
			arr=[0]*N
			for i in range(N):
				val=input()
				if(val>=1 and val<=1000):
					arr[i]=val
				else:
					break
		arr.sort()
		flag =False
		ind=0;
		for j in range(N):
			if(arr[j]==target ):
				flag=True
				break
			elif(arr[j]<target): 
				ind=j
				continue
			elif(arr[j]>target):
				break	
		current_sum=0
		print ind
		print flag
		print target
		if(flag!=True):
			cp=0
			curr_target=target
			vcc=ind
			while(cp<=vcc):
				print current_sum
				min_diff=100000
				val=0;
				for k in range(ind+1):
					if(target-arr[k]<min_diff and (target-arr[k])>=0):
						min_diff=target-arr[k]
						index=k

					else:
						continue
				arr = arr[:index] + arr[index + 1:]
				ind=ind-1
				current_sum=current_sum+arr[index]
				curr_target= curr_target-arr[index]
				if(current_sum==target):
					break
			
				cp=cp+1	
							

		print "after me"
		print current_sum
		if(flag==True or current_sum==target):
			result[count]="Yes"
		elif(flag==False):
			result[count]="No"
		else:
			break
		count= count+1
		
	
	for k in range(T):
		print result[k]	
