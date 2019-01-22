import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements in first array:");
		int n= sc.nextInt();
		int[] array1= new int[n];
		System.out.println("Enter the 1st array(sorted):");
		for(int i=0;i<n;i++) {
			array1[i]=sc.nextInt();
		}
		
		System.out.println("enter the number of elements in second array:");
		int m= sc.nextInt();
		int[] array2= new int[m];
		System.out.println("Enter the 2nd array(sorted):");
		for(int j=0;j<m;j++) {
			array2[j]=sc.nextInt();
		}
        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
        Arrays.sort(result);
        for(int i:result) {
        	System.out.println(i);
        }

        int x= result.length;
        if(x%2==0)
        	System.out.println("Median is:"+result[x/2-1]);
        else
        	System.out.println("Median is:"+result[(x-1)/2-1]);
	}

}
