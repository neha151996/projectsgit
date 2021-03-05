package Assignments;

import java.util.Scanner;

public class CheckKeyword {
	static String[] initProductNames() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of product:");
		int size=sc.nextInt();
		String str[]=new String[size];
		System.out.println("enter Product name:");	
		for(int i=0;i<size;i++)
		{
		str[i]=sc.next();
		}
		sc.close();
		return str;
	}

	static boolean isPresent(String[] productNames, String keyword) {
		int temp=0;
		for(String h:productNames)
		{
			
			if(h.indexOf(keyword)>-1)
			{
				temp++;
			}
		}
		if(temp==1)
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
		String h[]=initProductNames();
		System.out.println("is keyword exist? "+isPresent(h,"fruits"));
	}

}
