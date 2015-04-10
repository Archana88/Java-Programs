public class matrix3
{
	public static void main(String args[])
	{
		int a[ ][ ] = {{67,23,34},{24,31,45},{13,89,20}};
		int b[ ][ ]=new int [3][3];
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		b[i][j]=a[i][j];
		}
		System.out.println("Matrix is : ");
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<3;j++)
		System.out.print(b[i][j]+"\t");
		System.out.println();
		}
	}
}