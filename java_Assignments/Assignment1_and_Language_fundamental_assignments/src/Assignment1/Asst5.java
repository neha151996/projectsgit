//program to Find the total spaces present in a String
package Assignment1;

public class Asst5 {
	public static void main(String args[])
	{
		
	int count=0;
	String str="Hello world";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
		{
			count++;
		}
	}
	System.out.println("spaces in string:"+count);
	}
}
