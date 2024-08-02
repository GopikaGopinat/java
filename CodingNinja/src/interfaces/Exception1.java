package interfaces;

public class Exception1 {
	int a=100,b=0;
	public void div()
	{
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Exception handled");
		}
	}
	public static void main(String[] args) {
		Exception1 ob=new Exception1();
		ob.div();
	}

}
