package Arrays;

public class FriqOccresnce {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,2,3,5};
		int frq[]=new int[arr1.length];
		int vistit=-1;
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				if(arr1[i]==arr1[j]);
				count++;
				frq[j]=vistit;
			}
			if(frq[i]!=vistit)
			{
				frq[i]=count;
			}
		}
		
		//display
		
		System.out.println("elementrq"+" "+"element");
		
		for(int i=0;i<=frq.length-1;i++)
		{
			if(frq[i]!=vistit)
			{
				System.err.println(arr1[i]+" "+" "+frq[i]);
			}
		}
		
	}

}
