class InstanceOfDemo
{
	public static void main(String args[])
	{
		A1 oba1=new A1();
		B1 obb1=new B1();
		if(oba1 instanceof A1)
		System.out.println("oba1 is instance of A");
		if(oba1 instanceof B1)
		System.out.println("oba1 is instance of B");
		if(obb1 instanceof A1)
		System.out.println("obb1 is instance of A");
		if(obb1 instanceof B1)
		System.out.println("obb1 is instance of B");

	}
}
