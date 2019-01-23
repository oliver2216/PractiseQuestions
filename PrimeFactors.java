import java.util.Scanner;

public class PrimeFactors {
	
	void primeFactors(int n) 
	{ 
	  
	    while (n%2 == 0) 
	    { 
	        System.out.print(2+" ");
	        n = n/2; 
	    } 
	    for (int i = 3; i <= Math.sqrt(n); i = i+2) 
	    { 
	        while (n%i == 0) 
	        { 
	        	System.out.print(i+" ");
	            n = n/i; 
	        } 
	    } 
	    if (n > 2) 
	     System.out.println(n);
	} 

	public static void main(String[] args) {

			PrimeFactors pm= new PrimeFactors();
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number:");
			int n = sc.nextInt(); 
			if(n<0||n==1)
				System.out.println("Sorry, Invalid number. No prime Factorisation");
			else
				pm.primeFactors(n);  
		} 

}


