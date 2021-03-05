/*program for pattern
H
H E
H E L 
H E L L
H E L L O
*/
package Assignment1;

public class Asst6_1 {
	
	public static void main(String args[])
	{
		String st="Hello";
			for(int i=1;i<=st.length();i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(st.charAt(j)+" ");
				}
				System.out.println("");
			}
		
	}

}
