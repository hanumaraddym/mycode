package Stringss;

public class Dupicatwordsinstring {
	public static void main(String[] args) {
		 String str1="gsgsgs reddy hshsh sshsh";
		 char str2[]=str1.toCharArray();
	for(int i=0;i<=str1.length()-1;i++)
	{ int count=1;
		for(int j=i+1;j<=str2.length-1;j++)
		{

		if(str2[i]==str2[j] && str2[i]!=' ')
		{
			count++;
			str2[j]='0';
		}
		}
		
		if(count>1 && str2[i]!='0')
		{
			System.out.print(str2[i]);
		}	
	}
	
	
	
	}
	
}
