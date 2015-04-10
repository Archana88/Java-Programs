class assertdemo
{
	public static int n=3;
	public static int getnum()
	{
		return n--;
	}
	public static void main(String args[])
	{
		for(int a=0;a<10;a++)
		{
			int num=getnum();
			assert num>0;
			System.out.println(a);
		}
	}
}