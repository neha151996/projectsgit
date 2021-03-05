//program to display rectangular array of multiplication matrix.
package Assignment;

public class Assignment10 {
	
	static void displayMultiplicationMatrix()
	{
int array[][]=new int[13][13];
		
		for(int i=1;i<13;i++)
		{
		 array[i][0]=i;
		 array[0][i]=i;
		}
		for(int i=1;i<13;i++)
		{
			for(int j=1;j<13;j++)
			{
				array[i][j]=i*j;
				array[j][i]=i*j;
			}
			
		}
		
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<13;j++)
			{
				System.out.print("\t"+array[i][j]+" |");
				
			}
			System.out.println("\n");
			
			
		}
		
		
	}
	
	public static void main(String args[])
	{
		
		displayMultiplicationMatrix();
	}

}
