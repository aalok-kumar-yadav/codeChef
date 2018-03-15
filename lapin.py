T = input()
result =[None]*T

if(T>=1 and T<=100):
	count = 0
	while (count<T):
		#perform operation 
		string= raw_input()
		flag = False
		if len(string)>=2 and len(string)<=1000:
			if((len(string)%2!=0)):
				index=len(string)/2
				string = string[:index] + string[index + 1:]
			cp = 0		
			l=len(string)
			for i in range(l/2):
				cc = l/2
				while (cc<len(string)):
					if(string[i]==string[cc]):
						string = string[:cc] + string[cc + 1:]
						cp=cp+1
						break
					cc=cc+1	
			if cp==l/2:
				result[count]="YES"

			else:
				result[count]="NO"	
		else:
			flag=True
			break
		count= count+1
		
	if(flag!=True):
		for k in range(T):
			print result[k]	
