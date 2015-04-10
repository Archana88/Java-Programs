class Stack1
{
	int tos=-1;
	int s[]=new int[5];
	void push(int a)
	{
		if(tos==5)
		System.out.println("Stack overflow");
		else
		s[++tos]=a;
	}
	int pop()
	{
		if(tos==-1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		return s[tos--];
	}
}


