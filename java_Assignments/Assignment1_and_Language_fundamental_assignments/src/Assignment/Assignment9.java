//program for program of credit card company to calculate amount to be paid to customer on there given charges.
package Assignment;

public class Assignment9 {
	
	static float calLoan(int age, char gender,String job,int asset)
	{
		System.out.println("Age:"+age+" Gender:"+gender+" Job:"+job);
		double ammount=0;
		int asst=asset;
		if(asst<=500) {
			ammount=0.25*0.01*asst;
		}
		else if(asset>500&&asset<1500)
		{
			ammount=0.25*0.01*500;
			asst=asst-500;
			ammount+=0.50*0.01*asst;
		}
		else if(asset>1500&&asset<2500)
		{
			ammount=(0.25*0.01*500)+(0.50*0.01*1000);
			asst=asst-1500;
			ammount+=0.75*0.01*asst;
		}
		else
		{
			ammount=(0.25*0.01*500)+(0.50*0.01*1000)+(ammount+=0.75*0.01*1000);
			asst=asst-2500;
			ammount+=1.0*0.01*asst;
			
		}
			return (float)ammount;
	}
	public static void main(String args[])
	{
		//for customer with charges 400
		int asset=400;
		System.out.println("ammount to be paid:"+calLoan(24,'f',"supplier",asset));
		//for customer with charges 1400
		asset=1400;
		System.out.println("ammount to be paid:"+calLoan(24,'m',"supplier",asset));
		//for customer with charges 2000
		asset=2000;
		System.out.println("ammount to be paid:"+calLoan(24,'m',"Developer",asset));
		//for customer with charges 2600
		asset=2600;
		System.out.println("ammount to be paid:"+calLoan(24,'f',"Manager",asset));
		
		
	}

	
}
