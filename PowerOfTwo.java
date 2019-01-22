import java.util.Scanner;

public class PowerOfTwo {
	int check(int a) {
		if(a==1) 
			System.out.println("Yes");
		
		else {
			if(a%2==0)
				return check(a/2);
			else
				System.out.println("NO");
		}
		return 0;
	}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int str= sc.nextInt();
			PowerOfTwo ptw= new PowerOfTwo();
			ptw.check(str);
	}

}
