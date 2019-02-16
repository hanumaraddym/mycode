package Arrays;

public class LargesrArry {
	public static void main(String[] args) {
		int arr1[]= {2,3,2,5,4,7,8,6};
		
		int max=arr1[0];
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]>max)
			{
			max=arr1[i];	
			}
			
		}
		System.out.print(max);
	}

}
