//program for Find the total vowels present in a String
package Assignment1;

public class Asst4 {

	public static void main(String args[])
	{
		int count=0;
		String str="Hello world";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
				||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				count++;
			}
		}
		System.out.println("vowels in string:"+count);
	}
}
