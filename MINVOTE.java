import java.util.*;
public class MINVOTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		ArrayList<ArrayList<Integer>> al =new ArrayList<ArrayList<Integer>>();
		if(T>=1&&T<=100000) {
			int count=0;
			int sum_n=0;
			while(count<T&&sum_n<=1000000) {
				int N=input.nextInt();
				
				ArrayList<Integer> temp=new ArrayList<Integer>();
				if(N>=1&&N<=100000) {
					int arr[]=new int[N];
					sum_n=sum_n+N;
					for(int i=0;i<N;i++) {
						int val=input.nextInt();
						if(val>=1&&val<=1000000000) {
							arr[i]=val;
						}else {
							break;
						}
					}
					
					for(int k=0;k<N;k++) {
						int cf=0;
						for(int m=0;m<N;m++) {
							if(k==m) {
								continue;
							}else if(Math.abs(k-m)==1) {
								cf=cf+1;
							}else {
								int min=Integer.MAX_VALUE;
								int max=Integer.MIN_VALUE;
								if(k<m) {
									min=k;
									max=m;
								}else {
									min=m;
									max=k;
								}
								int sum=0;
								for(int a=min+1;a<=max;a++) {
									if(a!=max) {
										sum=sum+arr[a];
									}
								}
								if(arr[m]>=sum) {
									cf=cf+1;
								}
								
							}
						}
						temp.add(cf);
					}
				
				}
				
				al.add(temp);
				
				count++;
			}
			
			
			
			for(int i=0;i<T;i++) {
				for(int j=0;j<al.get(i).size();j++) {
					System.out.print(al.get(i).get(j)+" ");
				}
				System.out.println();
				
			}
		}

	}

}
