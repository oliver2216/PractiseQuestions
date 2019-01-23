import java.util.Scanner;

public class DifferenceInStrings {

	public static void main(String[] args) {
		
		String str1="abcdefghijklmnopqrstuvwxyz";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your string:");
		String str2=sc.nextLine();

		StringBuffer sb= new StringBuffer(100);
		char[] a= str1.toCharArray();
		for(char c: a) {
			int flag=0;
			for(int i=0;i<str2.length();i++) {
				if(c==str2.charAt(i)) {
					flag=1;
					break;
				}
				else 
					continue;
			}
			if(flag==0)
				sb.append(c);
			
		}
		System.out.println(sb);
		
	}
}
