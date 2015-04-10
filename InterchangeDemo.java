class InterchangeDemo
{
	public static void main(String args[])
	{

		String temp;
		int length=args.length-1;
		temp=args[0];
		args[0]=args[length];
		args[length]=temp;
		for(int i=0;i<args.length;i++)
		System.out.print(args[i]+" ");
	}
}
