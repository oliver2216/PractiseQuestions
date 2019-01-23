import java.util.Scanner;

public class PowerOfTen {
	int check(int a) {
		if(a==1) 
			System.out.println("Yes");
		
		else {
			if(a%10==0)
				return check(a/10);
			else
				System.out.println("NO");
		}
		return 0;
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int str= sc.nextInt();
			PowerOfTen ptw= new PowerOfTen();
			ptw.check(str);
	}

}
