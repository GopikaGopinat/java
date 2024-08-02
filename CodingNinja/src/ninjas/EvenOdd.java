package ninjas;

import java.util.Scanner;

public class EvenOdd {
	public static void main(Stringeg[] args) {
		Scanner sc=new Scanner(System.in);
		//int i,n,even=0,odd=0;
		int n,even=0,odd=0;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			i=sc.nextInt();
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
			
		}
		System.out.println(even);
		System.out.println(odd);
		/*while(n>0)
		{
			int digit=n%10;
			if(digit%2==0)
	
				even=even+digit;
			}
			else
			{
				odd=odd+digit;
			}
			n=n/10;
		}
		System.out.println(even+" "+odd);*/
		
		}	
}
