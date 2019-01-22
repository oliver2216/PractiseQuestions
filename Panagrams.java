import java.util.Scanner;

public class Panagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		char[] s1=str.toCharArray();
		int[] a=new int[26];
		for(char c:s1) {
			int temp=c;
			if(temp-65>=0&&temp-65<=26){
				temp-=65;
				a[temp]++;
			}
			if(temp-97>=0&&temp-97<=26){
				temp-=97;
				a[temp]++;
			}
		}
		int j=0;
		for(int i=0;i<26;i++) {
			if(a[i]==0) {
				j++;
				break;
			}
		}
		if(j==0) {
			System.out.println("Panagram");
		}
		else {
			System.out.println("Not Panagram");
		}
	}

}
