class BoxDemo
{
	public static void main(String args[])
	{
		double volume;
		box mybox1=new box();
		box mybox2=new box();
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=30;
		volume=mybox1.width*mybox1.height*mybox1.depth;
		System.out.println("Volume is : "+volume);

		mybox2.width=5;
		mybox2.height=4;
		mybox2.depth=10;
		volume=mybox2.width*mybox2.height*mybox2.depth;
		System.out.println("Volume is : "+volume);
	}
}