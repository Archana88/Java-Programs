class BoxDemo1
{
	public static void main(String args[])
	{
		double volume;
		box1 mybox1=new box1();
		box1 mybox2=new box1();
		mybox1.setDim(10,20,30);
		mybox2.setDim(10,40,60);
		System.out.println("Volume is : "+mybox1.volume());
		System.out.println("Volume is : "+mybox2.volume());
	}
}