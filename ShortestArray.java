
public class ShortestArray {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3},{12,2,3,4,6},{1,2,3,4},{1,12},{1,2}};
		int min=9999,x=arr.length,shor=0;
		
		for(int i=0;i<x;i++) {
			if(arr[i].length<min) {
				min=arr[i].length;
				shor=i;
			}

		}
		System.out.print("Shortest array is:");
		for(int i:arr[shor]) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println("");
		System.out.println("And its length is:"+min);
		
	}
}
