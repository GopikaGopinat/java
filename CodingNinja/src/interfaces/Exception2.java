package interfaces;

public class Exception2 {
	int a=20,b=0;
	public void div()
	{
		try
		{
		int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled"+e);
		}
	}
	public static void main(String[] args) {
		Exception2 ob=new Exception2();
		ob.div();
	}

}
