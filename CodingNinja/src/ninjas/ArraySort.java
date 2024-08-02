package ninjas;
public class ArraySort {
	public static void main(Stringeg[] args) {
		int arr[]= {60,45,39,19,10,4};
		int i,temp;
		for(i=0;i<6;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Sorted array is");
		for(i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		for(i=0;i<6;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
