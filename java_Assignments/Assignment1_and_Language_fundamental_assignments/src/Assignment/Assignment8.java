//program for electricity agency to calculate bill.
package Assignment;

public class Assignment8 {
	
	static float domasticBill(float units)
	{
		if(units<=100)
		{
			if((units*4)>250)
			{
				return units*4;
			}
			else
				return 250;
		}
		else if(units>100&&units<=300)
		{
			return (units*4.50f);
		}
		else if(units>300&&units<=500)
		{
			return (units*4.75f);
		}
		else
			return (units*5);
		
	}
	
	static float commercialBill(float units)
	{
		if(units<=100)
		{
			if((units*4.25)>350)
			{
				return units*4;
			}
			else
				return 350;
		}
		else if(units>100&&units<=300)
		{
			return (units*4.75f);
		}
		else if(units>300&&units<=500)
		{
			return (units*5);
		}
		else
			return (units*5.25f);
		
	}

	public static void main(String args[])
	{
		String type="commercial";
		float units=600;
		switch(type)
		{
		case "domastic":
			System.out.println("Electricity Bill: "+domasticBill(units));
			break;
			
		case "commercial":
			System.out.println("Electricity Bill: "+commercialBill(units));
			break;
		default:
			System.out.println("something went wrong");
		break;
		}
	}
}
