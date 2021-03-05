package Assignments;

import java.lang.StringBuffer;

public class StringWordReverse {

	public static String makeReverse(String str)
	{
		String s[] = str. split(" ");				//split word o each space and store them in array of String
		StringBuffer temp, sb=new StringBuffer();
		for (String h:s)
		{
			 temp=new StringBuffer(h);							//convert each word to stringbuffer
			 sb = sb.append((temp.reverse()).append(" "));	    //append each reverse word to make string
		}
		String ans=new String(sb);
		return ans;
	}
		
		public static void main(String args[])
		{
			String str="this is to be";
			System.out.println("reverse of string word:"+makeReverse(str));
				
		}


}
