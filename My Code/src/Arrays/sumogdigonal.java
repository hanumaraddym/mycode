package Arrays;

import java.util.Scanner;

public class sumogdigonal {
	public static void main(String[] args) {


		int array[][]= {{7,3,5},
				        {4,5,3},
				        {5,4,2}};
		//public static int arraySum(int[][] array){
		int sum = 0;

		for (int row = 0; row < array.length; row++)
		{
			sum= sum+array[row][row] + array[row][array.length-1 -row];
		}
		System.out.println(sum);
		//return total;
	}
}

