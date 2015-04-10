import java.util.*;

class ArraysDemo
{
	static void display(int array[])
	{
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		int arr[]=new int[5];
		arr[0]=11;
		arr[1]=7;
		arr[2]=38;
		arr[3]=71;
		arr[4]=1;
		System.out.println("Content : ");
		display(arr);
		Arrays.sort(arr);
		System.out.println("after sort : Content : ");
		display(arr);
		Arrays.fill(arr,2,4,8);
		System.out.println("after fill : Content : ");
		display(arr);
		int index=Arrays.binarySearch(arr,1);
		System.out.println("Index of 1 is : "+index);
	}
}

