import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
			int ar[]={2,6,9,5,9,3,7};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(ar));
		int sorted[]=mergesort(ar);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(sorted));
	}
		
		public static int[] mergesort(int arr[])
		{
			if(arr.length==1)
			return arr;
			
			int mid=arr.length/2;
			
			int[]left=mergesort(Arrays.copyOfRange(arr,0,mid));
			int[]right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
			
			return merge(left,right);
		}
		
		
		public static int[] merge(int[]first,int[]second)
		{
			int[]joined=new int [first.length+second.length];
			int i=0,j=0,k=0;
			while(i<first.length && j<second.length)
			{
				if(first[i]<second[j])
				joined[k++]=first[i++];
				
				else
				joined[k++]=second[j++];
			}
			
			while(i<first.length)
			{
				joined[k++]=first[i++];
			}
			
			while(j<second.length)
			{
				joined[k++]=second[j++];
			}
			return joined;
		}
	}
		
	