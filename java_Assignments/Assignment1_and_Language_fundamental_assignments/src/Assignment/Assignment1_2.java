//program for recognize vowel or not
package Assignment;

public class Assignment1_2 {
	static boolean checkAlpha(char alph)
	{
		if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		char d='y';
		if(checkAlpha(d))
		System.out.println(d+" is vowel ");
		else
			System.out.println(d+" is not vowel");
	}

}