package Arrays;

public class sumofelement {
	public static void main(String[] args) {
		int sum=0;
		int arr1[]= {2,22,3,3,3,3,3,3,3,3,3};
		 for(int i=0;i<=arr1.length-1;i++)
		 {
			  sum=arr1[i]+sum;
		 }
		 System.out.println(sum);
	}

}
