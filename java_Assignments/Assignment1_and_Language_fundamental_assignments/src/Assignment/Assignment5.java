//program for finding number is prime or not.
package Assignment;

public class Assignment5 {
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
		 int num=10;
		 if(isPrimeNumber(num))
		 {
			 System.out.println(num+" is a prime number");
		 }
		 else
			 System.out.println(num+ " is not prime number");
		 
	 }

}
