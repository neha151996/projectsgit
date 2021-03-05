package oopassignment1;

public class Medicine {
	public String name;
	public String company;
	Medicine(String nm,String cmp)
	{
		name=nm;
		company=cmp;
	}
	public  void displayLabel()
	{
		System.out.println("Medicine Name: "+name+"\nMedicine Company: "+company);
	}

}
