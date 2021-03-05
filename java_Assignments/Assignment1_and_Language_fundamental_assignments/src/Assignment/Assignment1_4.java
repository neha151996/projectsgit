//program to find calculate tax on given ammount.
package Assignment;

public class Assignment1_4 {
	static double calTax(int gp)
	{
		double tax;
		if(gp<=240)
		{
			tax=0;
		}
		else if(gp>240&&gp<480)
		{
			tax=(gp*15)/100;
		}
		else 
		{
			tax=(gp*28)/100;
		}
		
		return tax;
	}
	
	public static void main(String args[])
	{
		System.out.println("tax amount: "+calTax(460));
	}
	

}
