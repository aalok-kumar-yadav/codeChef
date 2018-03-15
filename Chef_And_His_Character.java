import java.util.*;
public class Chef_And_His_Character {
	static ArrayList<String> result=new ArrayList<String>();
	public static boolean is_match(String st){
		int count=0;
		String target="chef";
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(st.charAt(i)==target.charAt(j)){
					int tp=0;
					for(int k=0;k<4;k++ ){
						if(st.charAt(k)==st.charAt(i)){
							tp++;
						}
					}
					if(tp==1){
						count++;
					}
				}
			}
		}
		if(count==4){
		
			return true;
		}else{
			return false;
		}
		
	}
	
	
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		if(T>=1&&T<=200000){
			input.nextLine();
			for(int k=0;k<T;k++){
				String str=input.nextLine();
				if(str.length()>=1&&str.length()<=500000){
					
					int ct=0;
					for(int i=0;i<str.length();i++){
						String temp;
						if(i+3<str.length()){
							temp=str.substring(i, i+4);
							//System.out.println(temp);
							boolean bool=is_match(temp);
							if(bool==true){
								ct++;
							}
						}	
					}
					if(ct==0){
						result.add("normal");
					//	System.out.println("normal ");
					}else{
						result.add("lovely "+ct);
						
					}
					
					
				}	
				
				for(int m=0;m<result.size();m++){
					System.out.println(result.get(m));
				}
					
				}
		}
	}
}
