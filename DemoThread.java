class DemoThread
{
	public static void main(String args[])
	{
		new MyThread("Child Thread");
		for(int i=0;i<=2;i++)
		{
			System.out.println("Main thread "+i);
			try
			{
					Thread.sleep(1000); //1000 milli seconds
			}
			catch(InterruptedException e)
			{
			System.out.println("Interrupted Exception");
		    }
		}
	}
}
