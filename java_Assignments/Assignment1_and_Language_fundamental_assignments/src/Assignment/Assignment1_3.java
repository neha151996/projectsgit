//program for calculate interest on given deposit.
package Assignment;

public class Assignment1_3 {
	public static double calInterest(int deposit)
	{
		double interest;
		if(deposit<1000)
		{
			interest=(deposit * 4 * 1) / 100;
		}
		else if(deposit<=5000)
		{
			interest=(deposit * 4.5 * 1) / 100;
		}
		else 
		{
			interest=(deposit * 5 * 1) / 100;
		}
		return interest;
	}
	
	public static void main(String args[])
	{
		System.out.println("intrest is: "+calInterest(5000));
	}

}
