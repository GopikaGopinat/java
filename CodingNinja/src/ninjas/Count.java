package ninjas;
//count no of 1's in a number
public class Count {
	public static int count(int n)
	{
		int rem,count=0;
		while(n>0)
		{
			rem=n%2;
			if(rem==1)
			{
				count++;
			}
			n=n/2;
		}
		
		return count;
		
	}
	public static void main(Stringeg[] args) {
		int c=Count.count(13);
		System.out.println(c);
	}

}
