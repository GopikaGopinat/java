//Write a function that calculates the corresponding day of the week for any particular date in the past or future.
//For example, for the date 28th August 2020 happens to be Friday. Hence the expected output will be Friday.

package ninjas;
public class DayOfweek {
	public static Stringeg dayofweek(int day,int month,int year)
	{
		if(month<3)
		{
			month=month+12;
			year--;
		}
		int k=year%100;//k is last 2 digit of year
		int j=year/100;// j is first 2 digit of year
		int dayy=(day+13*(month+1)/5+k+k/4+j/4+5*j)%7;
		switch(dayy)
		{
		case 0: 
			return"Saturday";
		case 1:
			return"Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
			default:
				return "invalid";
		}
	}
	public static void main(Stringeg[] args) {
		Stringeg c=DayOfweek.dayofweek(20,7,2024);
		System.out.println(c);
		
	}

}
