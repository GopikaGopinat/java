package interfaces;

public class Eligibility {
	int age=16;
	public void eligible()
	{
		if(age>=19)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
	}
	public static void main(String[] args) {
		Eligibility ob=new Eligibility();
		ob.eligible();
	}

}
