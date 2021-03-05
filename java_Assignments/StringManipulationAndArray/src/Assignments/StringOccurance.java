//program for check the words occurance in sentence.
package Assignments;

public class StringOccurance {

public static int check(String sentence,String word)
	{

	 int count=0,index=0;
	 while(index<sentence.length())
	 {
		if(sentence.indexOf(word,index)==-1)
		{
			break;
		}
		else
		{
			index=sentence.indexOf(word,index);
			count++;
			index=index+word.length();
		}
			
	 }
		return count;
 	}
	
	public static void main(String args[])
	{
		String sentence="name is  in a name?.";
		String word="name";
		System.out.println("occurance of "+word+" :"+check(sentence,word));
			
	}
}
