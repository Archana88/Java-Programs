class rectangle1Demo
{
	public static void main(String args[])
	{
		double area;
		rectangle1 rect1=new rectangle1();
		rectangle1 rect2=new rectangle1();
		rect1.length=10;
		rect1.breadth=20;
		area=rect1.length*rect1.breadth;
		System.out.println("area is : "+area);

		rect2.length=5;
		rect2.breadth=4;
		area=rect2.length*rect2.breadth;
		System.out.println("area is : "+area);
	}
}