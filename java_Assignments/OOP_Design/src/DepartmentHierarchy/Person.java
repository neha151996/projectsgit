package DepartmentHierarchy;
import java.util.Scanner;
public class Person implements IPerson {
	Scanner sc=new Scanner(System.in);
	public String name;
	public void setname()
	{
		System.out.println("enter Name:");
		name=sc.nextLine();
	}
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}
	

}
