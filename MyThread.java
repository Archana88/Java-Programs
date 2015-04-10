class MyThread extends Thread //implements Runnable
{
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println("Child thread "+i);
			try
			{
					Thread.sleep(500); //500 milli seconds
			}
			catch(InterruptedException e)
			{
			System.out.println("Interrupted Exception");
		    }
		}
	}
	//Thread t; // only for Runnable as there is no inheritance of Thread constructor in Runnable
	MyThread(String name)
	{
		super("name"); //t=new Thread(this,name);
		this.start(); // t.start();
	}
}
