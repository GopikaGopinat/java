package interfaces;

public class Class3 implements Class1,Class2{
	public void number()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	public void print() {
		System.out.println("B= "+b);
	
	}
	public void dis() {
		System.out.println("A="+a);
		
	}
	
	public static void main(String[] args) {
		Class3 ob=new Class3();
		ob.number();
		ob.dis();
		ob.print();
	}
}
