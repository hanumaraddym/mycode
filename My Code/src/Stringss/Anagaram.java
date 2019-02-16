package Stringss;

import java.util.Arrays;

public class Anagaram {

	public static void main(String[] args) {

		
		String str1="reddy mallappa";
		String str2="mallappa reddy";
		
		str1=str1.replace(" ", "");
		str2=str2.replace(" ", "");
		
		if(str1.length()!=str2.length())
		{
			System.out.println("not anagaram");
		}
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char arr1[]=str1.toCharArray();
		char arry2[]=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arry2);
		
		boolean status=true;
		
		if(Arrays.equals(arr1, arry2)==true)
		{
			System.out.println("anagarm");
		}
		else
		{
			System.out.println("not angarm");
		}
	}

}
