package ninjas;
public class Value {
	int a,b;
	public Value(int a,int b)
	{
		this("Hello");
		this.a=a;
		this.b=b;	
		this.display();
	}
	public Value(Stringeg s)
	{
		System.out.println(s);
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
public static void main(Stringeg[] args) {
	Value x=new Value(10,15);
	//x.display(); main methodinn ullil vilikaruth method pakshe value kittem venam
}
}
