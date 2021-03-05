/**
 * @author: Neha Bankar
 * TestMedicine to use all Medicines classes.
 */
package oopassignment1;
import java.lang.Math.*;
import java.util.Random;
public class TestMedicine {

	public static void main(String[] args) {
		Medicine array[]=new Medicine[10];
		int num=0;
		Random rm=new Random();
		for(int i=0;i<10;i++)
		{
			num=Math.abs(rm.nextInt()%4);
			while(num==0)
			{
				num=Math.abs(rm.nextInt()%4);
			}
			switch(num)
			{
			case 1:array[i]=new Tablet("nicip","cipla","store in a cool dry place");
			break;
			
			case 2:array[i]=new Syrup("symune","sane care","store in a cool dry place");
			break;
			
			case 3:array[i]=new Ointment("move","mankind","for external use only");
			break;
			
			default:
				continue;	
			}
		}
		for(Medicine a:array )
		{
			a.displayLabel();
			System.out.println();
		}
		

	}

}
