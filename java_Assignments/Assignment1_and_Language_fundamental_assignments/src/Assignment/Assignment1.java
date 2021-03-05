//program to find max in three numbers.
package Assignment;

public class Assignment1 {
static int calMax(int x,int y,int z)
{
	if(x>y&&x>z)
	{
		return x;
	}
	else if(y>z)
	{
		return y;
	}
	else
	{
		return z;
	}
	
}

public static void main(String args[])
{
	System.out.println("Largest no: "+calMax(60,90,40));
}
}