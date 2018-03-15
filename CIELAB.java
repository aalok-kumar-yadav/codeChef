import java.util.*;
public class CIELAB {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int A=input.nextInt();
	int B=input.nextInt();
	if(A>=1&&A<=10000&&B>=1&&B<=10000&&A>B) {
		int C=A-B;
		String str=Integer.toString(C);
		int arr[]=new int[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=(int)str.charAt(i)-48;
		}
	
		while(true) {
			int ind=(int)(Math.random()*str.length());
		int val=(int)(Math.random()*10);
			if(ind==0&&val==0||arr[ind]-48==val) {
				continue;
			}else {
				arr[ind]=val;
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(arr[i]);
		}
			
	}
	
	}

}
