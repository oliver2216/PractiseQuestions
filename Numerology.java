import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Numerology {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		char[] s=str.toCharArray();
		int sum=0;
		for(char c: s) {
			if(c=='A'||c=='I'||c=='J'||c=='Q'||c=='Y')
				sum=sum+1;
			else if(c=='B'||c=='K'||c=='R')
				sum+=2;
			else if(c=='C'||c=='G'||c=='L'||c=='S')
				sum+=3;
			else if(c=='D'||c=='M'||c=='T')
				sum+=4;
			else if(c=='E'||c=='H'||c=='N'||c=='X')
				sum+=5;
			else if(c=='U'||c=='V'||c=='W')
				sum+=6;
			else if(c=='O'||c=='Z')
				sum+=7;
			else if(c=='F'||c=='P')
				sum+=8;
			else 
				continue;
				
		}
		if(sum>9) {
			int sum2=0, temp=0;
			while(sum>9 || sum2>9) {
				int r;
				r=sum%10;
				sum2=sum2+r;
				sum=sum/10;
				r=sum2%10;
				sum2=sum2/10;
				sum2+=r;
				
			}
			sum2=sum+sum2;
			System.out.println(sum2);
		}
		else
			System.out.println(sum);
		

	}

}
