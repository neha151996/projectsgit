package Assignments;

public class ReplaceWords {
	
	static String findAndReplace(String source,String keyword)
	{
		 String ans=source.replaceAll(keyword,"next");
			return ans;
	}
	public static void main(String args[])
	{
		 String src="the 3rd plan is on 3rd saturday shifted to 3rd week";
	   System.out.println("3rd replace with next"+findAndReplace(src,"3rd"));	
	}

}
