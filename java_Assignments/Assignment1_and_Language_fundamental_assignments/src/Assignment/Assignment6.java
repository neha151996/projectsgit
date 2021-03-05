//program to print prime numbers in range of 2 up to number get from console.
package Assignment;
import java.util.Scanner;

public class Assignment6 {

	 static void printPrime(int maxVal) {
		 int temp;
		 for(int j=2;j<=maxVal;j++)
		 {
			 temp=0;
			 for(int i=1;i<=j;i++)
			 {
				 if(j%i==0)
				 {
					temp++; 
				 }
			 }
			 if(temp<=2)
			 {
				 System.out.println(" "+j);
			 }
			
		 }
	 }
	 
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter max range:");
		 int max=sc.nextInt();
		 System.out.println("prime numbers");
		 printPrime(max);
		sc.close();
	 }
	 
}
