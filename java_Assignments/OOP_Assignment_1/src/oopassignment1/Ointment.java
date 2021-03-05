package oopassignment1;

public class Ointment extends Medicine{
		String info;

		Ointment(String nm, String cmp,String in) {
			super(nm, cmp);
			info=in;
			// TODO Auto-generated constructor stub
		}
		@Override
	  public void displayLabel()
	  {
		  System.out.println("Medicine Name: "+name+"\nMedicine Company: "+company+"\n Extra info: "+info);  
	  }
		

}
