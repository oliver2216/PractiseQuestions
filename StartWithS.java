import java.util.Scanner;

public class StartWithS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the string array:");
		int n= sc.nextInt();
		String[] str= new String[n];
		System.out.println("enter the Strings");
		for(int i=0;i<n;i++) {
			str[i]=sc.next();
			sc.nextLine();
		}
		for(String s:str) {
			
			if(s.charAt(0)=='s'||s.charAt(0)=='S') {
				System.out.println(s);
			}
		}
		
	}
}

