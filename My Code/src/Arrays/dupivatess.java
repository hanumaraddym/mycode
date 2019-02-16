package Arrays;

import java.util.Scanner;

public class dupivatess {
	public static void main(String[] args) {
		System.out.println("enter the array");
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[4];
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				
				arr1[i]=sc.nextInt();
			
			}
		}
		

		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=i+1;j<=arr1.length-1;j++)
			{
				//System.out.print(arr1[i]);
				if(arr1[i]==arr1[j])
				{
					System.out.print(arr1[j]);
				}
				System.out.print(arr1[j]);
			System.out.println();
			}
		}
		
		
		
		
		
	}

}
