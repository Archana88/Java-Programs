public class testarea
{
	public static void main(String args[])
	{
		int x,y;
		area1 myarea=new area1();
		x=myarea.square(8);
		System.out.println("The area is: "+x);
		y=4;
		x=myarea.square(y);
		System.out.println("The area is: "+x);
		
	}
}