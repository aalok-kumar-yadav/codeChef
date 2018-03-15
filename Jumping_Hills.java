import java.util.*;
class Jumping_Hills {
public static void main(String arg[]){
	Scanner input=new Scanner(System.in);
	int T=input.nextInt();
	if(T>=1&&T<=100){
		int result[]=new int[T];
		int count=0;
		while (count<T){
			int N=input.nextInt();
			if(N>=1&&N<=100){
				int U=input.nextInt();
				int D=input.nextInt();
				if(U>=1&&U<=1000000&&D>=1&&D<=1000000)
				{
					int arr[]=new int[N];
					for(int i=0;i<N;i++){
						int val=input.nextInt();
						if(arr[i]>=1&&arr[i]<=1000000){
							arr[i]=val;
						}
					}
					
					int fin_count=1;
					int para_count=0;
					
					for(int j=0;j<N;j++){
						if(j+1<N){
							if(arr[j+1]==arr[j]){
								fin_count++;
							}else if(arr[j+1]>arr[j]&&(int)Math.abs(arr[j+1]-arr[j])<=U){
								fin_count++;
							}else if(arr[j+1]<arr[j]&&(int)Math.abs(arr[j+1]-arr[j])<=D){
								fin_count++;
							}else if (arr[j+1]<arr[j] && para_count==0){
								para_count++;
								fin_count++;
							}else{
								break;
							}
						}
					}
					result[count]=fin_count;
					
					count++;
				}
				
				for(int k=0;k<T;k++){
					System.out.println(result[k]);
				}
					}
				}	
		
				}
					
				}
				
}
	

