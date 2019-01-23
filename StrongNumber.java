import java.util.Scanner;

public class StrongNumber {
	
	public int fact(int n) {
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}

	public static void main(String[] args) {

		StrongNumber st= new StrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int n= sc.nextInt();
		int sum=0;
		int r;
		int n1=n;
		while(n>0) {
			r=n%10;
			sum= sum + st.fact(r);
			n=n/10;
		}
		if(sum==n1) {
			System.out.println("Strong number");
		} 
		else {
			System.out.println("Not a strong number!!");
		}

	}

}
