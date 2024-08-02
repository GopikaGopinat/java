package interfaces;

public class Helo1 {
	public static void main(String[] args) {
		SampleThead1 st= new SampleThead1();
		Thread t=new Thread(st);
		t.start();
		
	}

}
