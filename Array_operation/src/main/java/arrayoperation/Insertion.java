package arrayoperation;

public class Insertion {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6},n=6;
		int pos=6,ele=7,i;
		int a[]=new int[n+1];
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(i=0;i<n+1;i++)
		{
			if(i<pos)
			{
			a[i]=arr[i];
			}
			else if(i==pos)
			{
			a[pos]=ele;
			}
			else if(i>pos)
			{
				a[i]=arr[i-1];
			}
		}	
		for(i=0;i<n+1;i++)
		{
			System.out.print(a[i]+" ");
		}
		}
		
		}


