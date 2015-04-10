class OverloadDemo
{
	public static void main(String args[])
	{
		Overload ob=new Overload();
		ob.test();
		ob.test(2,3);
		System.out.println("square is : "+ob.test(5));
		ob.test(8);
	}
}


