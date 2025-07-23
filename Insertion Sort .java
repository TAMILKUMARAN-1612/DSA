import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int arr[]={1,8,6,10,9,5};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int key=arr[i];
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
	}
	arr[j+1]=key;
		}
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));
}
}