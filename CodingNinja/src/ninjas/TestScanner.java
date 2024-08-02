package ninjas;

public class TestScanner {
	Hello obj;
	public  TestScanner(Hello obj)
	{
		this.obj=obj;
	}
	public void scan()
	{
		obj.onText("Scanned text");
	}


}
