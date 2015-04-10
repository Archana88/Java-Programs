class ReplaceDemo
{
	public static void main(String args[])
	{
		String s1= new String("I am Indian");
		char c[]=s1.toCharArray();
		int a=c.length;
		String s2= "xx"; //string to be replaced
		char d[]=s2.toCharArray();
		int b=d.length;
		char e[]=new char[a+b];
		int j=0;
		boolean h=true;
		int y=0;
		for(int i=0;i<a+b;i++)
		{
			if(c[i]=='a')
			{
				h=false;
				for(;b!=0;)
				{
					e[i]=d[j];
					y=i++;
					j++;
					b--;
					//System.out.print(y+" "+i);
				}
			}
			if(h)
			e[i]=c[i];
			else
			{
			e[i]=c[y];
			y++;
			}
			System.out.print(e[i]);
		}
	}
}