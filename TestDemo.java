class TestDemo
{
	public static void main(String args[])
	{
		Test ob1=new Test(100,122);
		Test ob2=new Test(100,122);
		Test ob3=new Test(400,162);
		System.out.println("1 ==2"+ob1.equal(ob2));
		System.out.println("2 ==3"+ob2.equal(ob3));
	}
}
