class BoxDemo2
{
	public static void main(String args[])
	{
		//double volume;
		box2 mybox1=new box2();
		box2 mybox2=new box2(10,40,60);
		box2 mybox3=new box2(10);
		box2 mybox4=new box2(mybox2);
		System.out.println("Volume is : "+mybox1.volume());
		System.out.println("Volume is : "+mybox2.volume());
		System.out.println("Volume is : "+mybox3.volume());
		System.out.println("Volume is : "+mybox4.volume());
	}
}