class ReverseDemo
{
	public static void main(String args[])
	{
		String s= "I am Indian";
		char c[]=s.toCharArray();
		int f=c.length-1;
		char d[]= new char[c.length];
		for(int j=0;j<=f;j++)
		{
			d[j]=c[f];
			f--;
		}
		for(int j=0;j<f;j++)
		System.out.print(d[j]);
	}
}