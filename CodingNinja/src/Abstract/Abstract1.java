package Abstract;

public class Abstract1 extends Abstract{
	public static void main(String[] args) {
		Abstract1 a=new Abstract1();
		a.name();
		a.dis(10,20);	
	}
	public void dis(int a,int b) {
		System.out.println(a);
		System.out.println(b);	
	}

}
