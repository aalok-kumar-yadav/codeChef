import java.util.*;
public class CHEGLOVE {
	public static void main(String arg[]) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		int result[]=new int[T];
		if(T>=1&&T<=10) {
			int count=0;
			while(count<T) {
				int N=input.nextInt();
				if(N>=1&&N<=100000) {
					int arr1[]=new int[N];
					int arr2[]=new int[N];
					for(int i=0;i<N;i++) {
						int val=input.nextInt();
						if(val>=1&&val<=1000000000) {
							arr1[i]=val;
						}else {
							break;
						}
					}
					for(int j=0;j<N;j++) {
						int val=input.nextInt();
						if(val>=1&&val<=1000000000) {
							arr2[j]=val;
						}else {
							break;
						}
					}
					boolean flag1=true;
					boolean flag2=true;
					
					for(int k=0;k<N;k++) {
						if(flag1==false&&flag2==false) {
							break;
						}else {
							
							if(arr1[k]<=arr2[k]) {
								
							}else {
								flag1=false;
								
							}
							if(arr1[N-1-k]<=arr2[k]) {
								
							}else {
								flag2=false;
							}
						}	
					}
					
					if(flag1==true&&flag2==false) {
						result[count]=0;
						
					}else if(flag2==true&&flag1==false) {
						result[count]=1;
					}else if(flag2==true&&flag1==true) {
						result[count]=2;
					}else {
						result[count]=-1;
					}
					
					
				}
				count++;
			}
			for(int j=0;j<T;j++) {
				if(result[j]==0) {
					System.out.println("front");
				}else if(result[j]==1) {
					System.out.println("back");
				}else if(result[j]==2) {
					System.out.println("both");
				}else {
					System.out.println("none");
				}
			}
			
			
			
		}
	}
}
