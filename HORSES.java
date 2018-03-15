import java.util.*;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
public class HORSES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		long result[]=new long[T];
		if(T>=1&&T<=10) {
			int count=0;
			while(count<T) {
				long min_diff=Integer.MAX_VALUE;
				int n=input.nextInt();
				if(n>=2&&n<=5000) {
					
					long arr[]=new long[n];
					for(int j=0;j<n;j++) {
						long val=input.nextLong();
						if(val>=1&&val<=1000000000) {
							arr[j]=val;
						}else {
							break;
						}
					}
					
					for(int i=0;i<n;i++) {
						for(int j=i+1;j<n;j++) {
							if(Math.abs(arr[i]-arr[j])<min_diff) {
								min_diff=Math.abs(arr[i]-arr[j]);
							}
						}
					}
				}
				
				result[count]=min_diff;
				count++;
			}
			
			for(int k=0;k<T;k++) {
				System.out.println(result[k]);
			}
			
			
			
		}
	}

}
