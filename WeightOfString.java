import java.util.Scanner;

public class WeightOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();

		char[] s1=str.toCharArray();
		int weight=0;
		for(char c:s1) {
			if(c==' ') {
				continue;
			}
			else {
			int temp=c;
			if(temp-64>=0&&temp-45<=26){
				temp-=64;
				weight+=temp;
			}
			if(temp-96>=0&&temp-96<=26){
				temp-=96;
				weight+=temp;
			}
			}
		}
		System.out.println("Weight of the string is:"+weight);
	}
}
