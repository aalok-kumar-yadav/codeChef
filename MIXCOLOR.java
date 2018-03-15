import java.util.*;
public class MIXCOLOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T =input.nextInt();
		int result[]=new int[T];
		if(T>=1&&T<=10) {
			int count=0;
			while(count<T) {
				int N=input.nextInt();
				if(N>=1&&N<=100000) {
					int arr[]=new int[N];
					for(int b=0;b<N;b++) {
						int val=input.nextInt();
						if(val>=1&&val<=1000000000) {
							arr[b]=val;
						}
					}
					boolean flag=false;
					int p=-1;int q=-1;
						for(int k=0;k<N;k++) {
							
							for(int m=k+1;m<N;m++) {
								if(arr[k]==arr[m]) {
									flag=true;
									p=k;q=k;
								}
							}
						}
						
						if(flag==false) {
							result[count]=0;
							
						}else {
							System.out.println("i ");
							flag=false;
							
							for(int ct=0;ct<N;ct++) {
								int vv=0;
								while(vv<N) {
									if(p!=vv) {
										arr[p]=arr[vv]+arr[p];
										break;
										
									}else {
										vv++;
										continue;
									}
									
								}
								
							for(int k=0;k<N;k++) {
								for(int m=k+1;m<N;m++) {
									if(arr[k]==arr[m]) {
										flag=true;
										
									}
								}
							}
						
							if(flag==true) {
								continue;
							}else {
								result[count]=ct+1;
								
								break;
							}
								
							}
								
						}
		
				}
			
				count++;
			}
			
			for(int k=0;k<T;k++) {
				System.out.println(result[k]);
			}
		}
		

	}

}
