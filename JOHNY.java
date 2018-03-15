import java.util.*;

public class JOHNY {
	public static void main(String arg[]) {
	Scanner input=new Scanner(System.in);
	int T=input.nextInt();
	int result[]=new int[T];
	if(T>=1&&T<=1000) {
		int count=0;
		while(count<T) {
			int N=input.nextInt();
			if(N>=1&&N<=100) {
				ArrayList<Integer> arr=new 	ArrayList<Integer> ();
				for(int i=0;i<N;i++) {
					int val=input.nextInt();
					if(val>=1&&val<=1000000000) {
						arr.add(val);
					}else {
						break;
					}
				}
				int K=input.nextInt();
				int val_k=arr.get(K-1);
				Collections.sort(arr); 
				int fin_index=arr.indexOf(val_k);
				result[count]=fin_index+1;
				
			}else {
				break;
			}
			
			count++;
		}
		
		for(int i=0;i<T;i++) {
			System.out.println(result[i]);
		}
	}
		
		
	}
	
}
