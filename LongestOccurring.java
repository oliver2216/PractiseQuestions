import java.util.Scanner;

public class LongestOccurring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		int max=1,index=0;
		int temp=1;
		for(int i=0;i<str.length()-1;i=i+temp) {
			
			temp=1;
			for(int j=i;j<str.length()-1;j++) {
			
				if(str.charAt(j)==str.charAt(j+1)) 
					temp++;
			
				else 
					break;
					
			}
			if(temp>max) {
				max=temp;
				index=i;				
		}
		
	}
		
		System.out.print("Longest occurring character is "+str.charAt(index)+" and length is "+max+" occurring at "+(index+1));

}
}
