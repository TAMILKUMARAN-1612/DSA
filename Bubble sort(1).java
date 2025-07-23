import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[]={30,25,15,10,5,20,40,50,45,55};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
	}
} 		}
System.out.println("\nAfter Sorting");
	System.out.println(Arrays.toString(arr));

	}
	}
	