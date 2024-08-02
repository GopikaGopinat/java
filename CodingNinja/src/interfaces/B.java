package interfaces;

public class B implements A {
  static int sum;
	public void add() {
		 sum=a+b;
	}
	public void dis() {
		System.out.println("Sum= "+sum);
	}
	public static void main(String[] args) {
		B ob=new B();
		ob.add();
		ob.dis();
	}
}
