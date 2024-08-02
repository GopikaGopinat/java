package ninjas;

public class Sample extends Hello{
	public void onText(Stringeg text) {
		System.out.println(text);
	}
	public Sample()
	{
		TestScanner ts=new TestScanner(this);
		ts.scan();
	}
	public static void main(Stringeg[] args) {
		Sample s=new Sample();
		
	}

	

}
