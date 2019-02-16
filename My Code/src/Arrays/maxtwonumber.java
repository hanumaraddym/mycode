package Arrays;

public class maxtwonumber {
	public static void main(String[] args) {
		int arr1[]= {2,3,6,3,7,8,9};
		int temp;
		for( int i=0;i<=arr1.length-1;i++)
		{
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				if(arr1[i]<arr1[j])
				{
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			//System.out.print(" "+arr1[i]);
			//System.out.println(arr1[0]);
			//System.out.println(arr1[arr1.length-2]);
			//System.out.println(arr1[arr1.length-3]);
		}
		System.out.println(arr1[0]);
		System.out.println(arr1[2]);
	}

}
