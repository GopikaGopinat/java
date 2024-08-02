package ninjas;

import java.util.Scanner;
public class Day {
	public static void main(Stringeg[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		if(m<3)
		{
			m=m+12;
			y--;
		}
		int k=y%100;
		int j=y/100;
		int day=(d+13*(m+1)/5+k+k/4+j/4+5*j)%7;
		switch(day)
		{
		case 0:
			System.out.println("saturday");
			break;
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
			case 6:
				System.out.println("friday");
			break;
			default:
				System.out.println("invalid");
			
		}
		
		
	}

}
