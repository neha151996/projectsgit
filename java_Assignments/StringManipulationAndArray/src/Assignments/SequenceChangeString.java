package Assignments;

public class SequenceChangeString {
	
	public static void main(String args[])
	{
		String str="abc",Str=new String();
		int length=str.length();
		char s[]=new char[length],temp;
	//	s=str.toCharArray();
		for(int i=0;i<length-1;i++)
			{
			 for (int j=0;j<i;j++)
			{s=str.toCharArray();
			temp=s[i];
			s[i]=s[i+1];
			s[i+1]=temp;		
			Str=Str.copyValueOf(s);
			System.out.println(Str);
			}
			}
		
	}

}
