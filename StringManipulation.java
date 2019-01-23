import java.util.*;

public class StringManipulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String str = sc.nextLine();
		HashSet<String> set = new HashSet<String>();
		String[] strnew= str.split(" ");
		for(String s:strnew) 
			set.add(s);
		
		for(String sout:set)
			System.out.print(sout+" ");
		
	}

}
