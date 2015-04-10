class StackDemo1
{
	public static void main(String args[])
	{
		Stack1 s=new Stack1();
		for(int i=0;i<5;i++)
		{
			s.push(i);
		}
		System.out.println("Stack is : ");
		for(int i=0;i<5;i++)
		{
			System.out.println(s.pop());
		}

	}
}