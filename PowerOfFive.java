import java.util.Scanner;

public class PowerOfFive {
	int check(int a) {
		if(a==1) 
			System.out.println("Yes");
		
		else {
			if(a%5==0)
				return check(a/5);
			else
				System.out.println("NO");
		}
		return 0;
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int str= sc.nextInt();
			PowerOfFive ptw= new PowerOfFive();
			ptw.check(str);
	}

}
