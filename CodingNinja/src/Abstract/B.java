package Abstract;

public class B extends A {
	public void add() {
		int a=80,b=20;
		int sum=a+b;
		System.out.println("Sum= "+sum);
		
	}
	public static void main(String[] args) {
		B ob=new B();
		ob.add();
		
	}
	

}
