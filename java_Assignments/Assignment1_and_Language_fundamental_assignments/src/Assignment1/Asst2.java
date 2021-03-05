//program for display numbers who are even and divisible by 5.
package Assignment1;

public class Asst2 {
	public static void main(String args[])
	{
	int arr[]= {20,45,66,1,2,30,3,11,8,9};
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0&&arr[i]%5==0)
		{
			System.out.println(arr[i]);
		}
	}
	
	}

}
