import java.util.*;
public class CONFLIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		ArrayList<Integer> result=new ArrayList<Integer>();
		if(T>=1&&T<=10) {
			int count=0;
			while(count<T) {
				int G=input.nextInt();
				if(G>=1&&G<=20000) {
					int ct=0;
					while(ct<G) {

						int arr[]=new int[3];
						for(int i=0;i<3;i++) {
							arr[i]=input.nextInt();
							if(arr[0]>=1&&arr[0]<=2&&arr[2]>=1&&arr[2]<=2&&arr[1]>=1&&arr[1]<=1000000000) {
							int val_c=arr[1];
								val_c=val_c/2;
								if(arr[0]==arr[2]) {
									result.add(val_c);
								}else {
									result.add(arr[1]-val_c);
								}
								
							}
						}
						ct++;
					}
					
				}else {
					break;
				}
				
				count++;
			}	
			
			for(int b=0;b<result.size();b++) {
				System.out.println(result.get(b));
			}
			
		}
	}

}
