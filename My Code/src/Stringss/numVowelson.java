package Stringss;

public class numVowelson {
	public static void main(String[] args) {
		int vow=0;
		int con=0;
		String str1="reddy hogaranal sindhanur";
		 
		//char[] arry=str1.toCharArray();
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='o' )
		
			{
				vow++;
			}
			else
			{
				con++;
			}
		}
		System.out.println(vow+" "+con);
		
	}

}
