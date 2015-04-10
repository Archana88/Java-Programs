
import java.io.*;

class A
{
	public static void main(String args[])//throws IOException
	{
		InputStreamReader isr=new InputStreamReader();
		BufferedReader br=new BufferedReader(isr);
		int sum=0;
		System.out.println("Enter 2 numbers : ");
		for(int i=0;i<2;i++)
		{
			sum+=(int) br.readLine();
		}
		System.out.println("The sum of 2 numbers is : "+sum);
	}
}