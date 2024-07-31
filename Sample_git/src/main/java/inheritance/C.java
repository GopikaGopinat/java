package inheritance;

public class C extends Hierchical{
	public void d()
	{
		System.out.println("Class C");
	}
	public static void main(String[] args) {
		A ob=new A();
		B ob1= new B();
		C ob2=new C();
		ob.a();
		ob1.a();
		ob2.a();
		
	}

}
