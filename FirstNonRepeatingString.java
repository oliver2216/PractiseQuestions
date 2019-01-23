import java.util.Scanner;

public class FirstNonRepeatingString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String:");

		String str = new String();
			str=sc.nextLine();
					System.out.println(str);
		
			for(int k=0;k<str.length();k++) {
				int check=0;
				char c= str.charAt(k);
				
				for(int j=0;j<str.length();j++) {
					
					if(c==str.charAt(j) && k!=j) {
						check=1;
						break;
					}
				  }
				if(check==0) {
					System.out.print(c);
					break;
				}
			}
		}
		
		
}
