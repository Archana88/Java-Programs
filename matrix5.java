public class matrix5
{
	public static void main(String args[])
	{
		int a[ ][ ] = {{67,23,34},{24,31,45},{13,89,20}};
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		a[i][j]+=10;
		}
		System.out.println("Matrix is : ");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		System.out.print(a[i][j]+"\t");
		System.out.println();
		}
	}
}