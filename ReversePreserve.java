import java.util.Scanner;

public class ReversePreserve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		int k=str.length()-1;
		StringBuffer result=new StringBuffer(50);
		for(int i=0;i<str.length();i++) {
				
				if(str.charAt(i)==' ') {
					result=result.append(" ");
				}
				
				else {
					if(str.charAt(k)!=' ') {
						result=result.append(str.charAt(k));
						k--;
					}
					else {
						k--;
						result=result.append(str.charAt(k));
						k--;
					}
				
				}
			}
		
		
		System.out.println(result);

	}

}
