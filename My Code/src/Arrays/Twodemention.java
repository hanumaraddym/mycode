package Arrays;

import java.util.Scanner;

public class Twodemention {
	public static void main(String[] args) {
		
		System.out.println("enter the arry ");
		Scanner sc=new Scanner(System.in);
		
		int arr1[][][]=new int[2][3][2];
		//storing
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				for(int k=0;k<=arr1[i][j].length-1;k++)
				arr1[i][j][k]=sc.nextInt();
				//System.out.println(arr1[i][j]);
			}
			
		}
	//	disp
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				for(int k=0;k<=arr1[i][j].length-1;k++)
				System.out.print(" "+arr1[i][j][k]+" ");
			}
			
			
		}
		System.out.println();

	}

}
