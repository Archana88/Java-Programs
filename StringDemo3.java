class StringDemo3
{
	public static void main(String args[])
	{
		StringBuffer s5=new StringBuffer(5);
		System.out.println(s5.append("hello"));
		System.out.println(s5.capacity()+" " + s5.length());
	}
}