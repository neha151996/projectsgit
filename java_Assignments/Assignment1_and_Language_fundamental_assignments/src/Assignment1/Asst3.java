//program for counting character in string.
package Assignment1;

public class Asst3 {

	public static void main(String args[])
	{
		int count=0;
		String str="Hello world";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("character in string:"+count);
	}
}
