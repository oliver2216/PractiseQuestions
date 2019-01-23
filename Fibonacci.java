

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the term upto which you want to see fibonacci series:");
		int n= sc.nextInt();
		int a=1,b=1,c;
		if(n==1)
			System.out.println(a);
		else if(n==2)
			System.out.println(a+","+b);
		else {
			System.out.print(a+","+b+",");
			for(int i=3;i<=n;i++) {
				c=a+b;
				if(i!=n) {
					
					System.out.print(c+",");
					a=b;
					b=c;
					
				}
				else
					System.out.println(c);
			
			}
		}

	}

}
