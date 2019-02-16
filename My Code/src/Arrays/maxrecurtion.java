package Arrays;

public class maxrecurtion {
	
	public static int maxnumber(int arr1[],int total)
	{
		for(int i=1;i<=arr1.length-1;i++)
		{
			for(int j=1;j<=arr1.length-1;j++)
			{
				if(arr1[i]<arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		
		
		return arr1[total-1];
		
	}
	
	
	
	
public static void main(String[] args) {
	
	int arr1[]= { 1,3,3,3,4,8,9};
	int total=arr1.length-1;
	maxrecurtion max=new maxrecurtion();
	max.maxnumber(arr1, total);
	
	System.out.println(maxnumber(arr1,total-1));
	
}
}
