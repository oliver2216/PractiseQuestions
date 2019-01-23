import java.util.Scanner;

public class FirstNonRepeating {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words:");
		int n = sc.nextInt();
		System.out.println("Enetr the words:");

		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			
			str[i]=sc.next();
			//sc.nextLine();
					
		}
		int check=0;
		for(int i=0;i<str.length;i++) {
			String p= str[i];
		
			for(int k=0;k<p.length();k++) {
				
				char c= p.charAt(k);
				
				for(int j=0;j<p.length();j++) {
					if(j==k)
						continue;
					else {
					
					if(c==p.charAt(j)) {
						check=1;
						break;
					}
				  }
				}
				if(check==0 && i<str.length-1) {
					System.out.print(c+",");
					break;
				}
				else {
					System.out.print(c);
					break;
				}
			}
		}
		
		
	}

}
