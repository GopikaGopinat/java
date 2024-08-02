  package interfaces;

public class TryCatch {
	int a=30,b=0;
	public void sum()
	{
		try
		{
		int c=a/b;
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<7;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	    }
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled" +e);
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("Exception handled"+g );
		}
		
	}
	public static void main(String[] args) {
		TryCatch ob=new TryCatch();
		ob.sum();
	}
}
