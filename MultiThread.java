class MultiThread
{
	public static void main(String args[])
	{
		MyThread t1=new MyThread("Child Thread1");
		MyThread t2=new MyThread("Child Thread2");
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
