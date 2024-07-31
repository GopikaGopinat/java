package arrayoperation;

public class Deletion {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60},n=6;
		int i,j,ele=40;
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==ele)
			{
				for(j=i;j<n-1;j++)
				{
				arr[j]=arr[j+1];
			    }
			}
		}
		System.out.println();
		for(i=0;i<n-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
