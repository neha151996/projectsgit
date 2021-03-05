//program for movie theater to calculate profit by entering number of attendees.
package Assignment;

public class Assignment7 {
	static float calculateProfit(int numAttendees)
	{
		float profit,cost,income;
		income=numAttendees*5+(20+(50*numAttendees));
		cost=20+(50*numAttendees);
		profit=income-cost;
		return profit;
		
	}
	 
	public static void main(String args[])
	{
		int attendees=89;
		System.out.print(calculateProfit(attendees));
	}

}
