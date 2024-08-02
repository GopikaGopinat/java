package ninjas;

public class Prime1 {
public static void main(Stringeg[] args) {
	int flag=0;
	for(int i=2;i<=10;i++)
{
	     	for(int j=2;j<i;j++)
	 {
		    if(i%j==0)
		{
			flag=1;
			break;
		}
		else
		{
			flag=0;
		}
	}
		if(flag==0)
		{
			System.out.print(i+" ");
		}
	
		}
	}
}

