package Assignments;

public class ArrayNumberPosition {
	

	public static int findPosition(int no,int[] nos)
		{

		 for(int i=0;i<nos.length;i++) {
			if(nos[i]==no)
			{
				return i+1;
			}
				
		 }
		 return 0;
	 	}
		
		public static void main(String args[])
		{
			int arr[]= {10,20,39,66,33};
			int no=20;
			System.out.println("position of"+no+" :"+findPosition(no,arr));
				
		}


}
