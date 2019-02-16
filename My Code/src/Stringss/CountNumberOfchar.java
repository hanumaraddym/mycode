package Stringss;

public class CountNumberOfchar {
public static void main(String[] args) {
	String str1="pakka job sigutte don't worry";
	int count=0;
	
	for(int i=0;i<=str1.length()-1;i++)
	{
		if(str1.charAt(i)!=' ')
		{
			count++;
		}
		
	}
	System.out.println(count);
}
}
