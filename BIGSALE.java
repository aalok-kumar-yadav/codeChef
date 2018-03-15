import java.util.*;
public class BIGSALE {
	public static void main(String arg[]) {
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		double result[]=new double[T];
		if(T>=1&&T<=10) {
			int count=0;
			while(count<T) {
				int N=input.nextInt();
				if(N>=1&&N<=100000) {
					double fin_val=0.000000000;
					for(int i=0;i<N;i++) {
						double arr[]=new double[3];
						for(int j=0;j<3;j++) {
							double val=input.nextDouble();
							if(j==0&&val>=1&&val<=100||j==1&&val>=1&&val<=100) {
								arr[j]=val;
							}else if(j==2&&val>=0&&val<=100) {
								arr[j]=val;
							}else {
								break;
							}
						}
						double temp_arr0=arr[0]+((arr[0]*arr[2])/100);
						//System.out.println(temp_arr0);
					double temp_val=temp_arr0-((temp_arr0*arr[2])/100);
						//System.out.println(temp_val);
					double db= (arr[0]-temp_val)*arr[1];
						//System.out.println(db);
						fin_val=fin_val+db;
						
					}
				
					result[count]=fin_val;
					
				}else {
					break;
				}
				count++;
			}
			for(int i=0;i<T;i++) {
				
				String str=Double.toString(result[i]);
			
				for(int j=0;j<str.length();j++) {
					System.out.print(str.charAt(j));
				}
				for(int k=str.length();k<12;k++) {
					System.out.print(0);
				}
				System.out.println();
			}
			
			
		}
	}
}
