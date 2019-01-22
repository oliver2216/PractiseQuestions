import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first string:");
	String str= sc.next();
	System.out.println("Enter the second string:");
	sc.nextLine();
	String str2= sc.next();
	char[] s1= str.toCharArray();
	char[] s2= str2.toCharArray();
	Arrays.sort(s1);
	Arrays.sort(s2);
	if(str.length()==str2.length()) {
		Arrays.sort(s1);
		Arrays.sort(s2);
		boolean b=Arrays.equals(s1, s2);
		if(b) {
		System.out.println("ANAGRAM");}
		
		else {
			System.out.println("NOT an ANAGRAM");
		}
	}
	else {
		System.out.println("NOT ANAGRAM");
	}

	}

}
