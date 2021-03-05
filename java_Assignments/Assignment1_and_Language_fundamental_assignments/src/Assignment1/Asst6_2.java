/*program to print pattern for string str="this is a java world"
 * this
 * is
 * a
 * java
 * world
 
 */

package Assignment1;

public class Asst6_2 {

	
	public static void main(String args[])
	{
		String st="This is a java World";
			int i=0;
			while(i<st.length())
			{
				System.out.print(st.charAt(i));
				if(st.charAt(i)==' ') 
				{
					System.out.println();
				}
				i++;
			}
		
	}
}
