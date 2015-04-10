class Test
{
	int a,b;
	Test(int i,int j)
	{
		a=i;
		b=j;
	}
	boolean equal(Test c)
	{
		if(c.a==a&&c.b==b)
		return true;
		else
		return false;
	}
}