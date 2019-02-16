package Arrays;

public class Revers {
	public static void main(String[] args) {
		
		int arr[]=new int[5];
		arr[0]=1;
		arr[2]=17;
		arr[3]=7;
		arr[4]=18;
		arr[1]=5;
		
		for(int k:arr)
		 System.out.print("orinal "+k);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println("rev");
			System.out.print(arr[i]);
		}
	}

}
