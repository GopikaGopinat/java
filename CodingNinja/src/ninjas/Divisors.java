package ninjas;

import java.util.Scanner;

public class Divisors {
	public static void main(Stringeg[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Divisors of "+n +" are");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
