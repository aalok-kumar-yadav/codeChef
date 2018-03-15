import java.util.*;
public class CLEANUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		
		if(T<=50) {
			int count=1;
			while(count<=T) {
				int n=input.nextInt();
				int m=input.nextInt();
				int arr[]=new int[m];
				
				if(m>=0&&m<=1000&&n>=0&&n<=1000&&m<=n) {
					for(int j=0;j<m;j++) {
						arr[j]=input.nextInt();
					}
					ArrayList<Integer> chef=new ArrayList<Integer>();
					ArrayList<Integer> assis=new ArrayList<Integer>();
					int turn=0;
					for(int i=1;i<=n;i++) {
						boolean found=false;
						
						for(int k=0;k<m;k++) {
							if(i==arr[k]) {
								found=true;
							}
						}
						if(found==true) {
							continue;
						}else if(found==false&&turn==0) {
							 chef.add(i);
							turn=1;
							
						}else if(found==false&&turn==1) {
							assis.add(i);
							turn=0;
						}
						
						
					}
					result.add(chef);
					result.add(assis);
					
					
				}
			
				count++;
			}
			
			for(int i=0;i<result.size();i++) {
				
				for(int j=0;j<result.get(i).size();j++) {
					System.out.print(result.get(i).get(j)+" ");
				}
				System.out.println();
			}
			
			
		}
		
	}

}
