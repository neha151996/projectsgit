//program for sum of prime numbers in array.
package Assignment1;

public class Asst1 {

	 static boolean isPrimeNumber(int num)
	 {
		 int temp=0;
		 for(int i=1;i<=num;i++)
		 {
			 if(num%i==0)
			 {
				 temp++;
			 }
		 }
		 if(temp<=2)
		 {
			 return true;
		 }
		 else
			 return false;
	 }
	public static void main(String args[])
	{
		int arr[]= {20,45,66,1,2,3,11,8,9};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrimeNumber(arr[i]))
			{
				sum+=arr[i];
			}
		}
		
		System.out.println(sum);
		
	}
}
