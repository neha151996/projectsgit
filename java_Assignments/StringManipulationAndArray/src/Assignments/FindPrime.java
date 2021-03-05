package Assignments;

public class FindPrime {

	public static int[] findPrimeNo(int fno,int last)
	{
		int temp=0,k=0,count=0;
		int[] arr=new int[last-fno+1];
		for(int i=fno;i<=last;i++)
		{
			temp=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			if(temp<=2)
			{
				arr[k]=i;
				k++;
				count++;
			}
		}
		int[] array=new int[count];
		for(int i=0;i<count;i++) array[i]=arr[i]; 
		return array;
	}
	
	public static void main(String args[])
	{
		int start=2,end=50;
		System.out.println("Array of prime no from given range:");
		int[] i=new int[end-start+1];
		i=findPrimeNo(start,end);
		for(int h:i)
		{
			System.out.print(h+" ");
		}
		
	}
}
