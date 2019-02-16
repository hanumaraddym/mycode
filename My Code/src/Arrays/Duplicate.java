package Arrays;

import java.util.Scanner;

public class Duplicate {
public static void main(String[] args) {
	 System.out.println("enter the array values");
	 Scanner sc=new Scanner(System.in);
	 int arr[]=new int[5];
	for(int i=0;i<=arr.length-1;i++)
	{
		 arr[i]=sc.nextInt();
	}
	//display
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println(" out no"+arr[i]);
	}
}

}
