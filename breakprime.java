class breakprime
{
	public static void main(String args[])
	{
		boolean t=true;
		int num=4;
		for(int i=2;i<=num/2;i++)
		{
			if((num%i)==0)
			{
			t=false;
			break;
		}
	}
	if(t)
	System.out.println("prime");
	else
	System.out.println("not prime");
}
}