public class matrix4
{
	public static void main(String args[])
	{
		double a[ ] = {67.9,23,34.6,24,31.5,45.2,13,89,20};
		double sum=0; 
		int num=9;
		for(int i=0;i<9;i++)
		{
		sum+=a[i];
		}
		double average=sum/num;
		System.out.println("Average is : "+average);
		
	}
}