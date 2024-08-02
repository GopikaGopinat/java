package ninjas;
import java.lang.*;

public class Absolute {
	public static void main(Stringeg[] args) {
		int arr[]= {1,2,3,4,5,6};
	     int even=0,odd=0;
	     for(int i=0;i<6;i++)
	     {
	    	 if(i%2==0)
	    	 {
	    		 even=Math.abs(even-arr[i]);
	    	 }
	    	 else
	    	 {
	    		 odd=Math.abs(odd-arr[i]);
	    	 }
	     }
	     System.out.println("Even= "+even);
	     System.out.println("Odd= "+odd);
	
	}

}
