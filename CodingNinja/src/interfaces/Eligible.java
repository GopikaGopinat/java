package interfaces;
public class Eligible {
	int age=16;
	public void eligibility() throws VoteException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new VoteException("invalid");
		}
	
	}
	public static void main(String[] args) throws VoteException {
		Eligible ob=new Eligible();
		ob.eligibility();
	}

}
