class NewThread implements Runnable
{
	public void run()
	{
		try
			{
				for(int i=0;i<=3;i++)
				{
					System.out.println("Child thread "+i);
					Thread.sleep(1000); //1000 milli seconds
				}
			}
			catch(Exception e)
			{
			System.out.println("Exception");
		    }
		    System.out.println(name+" Thread is Exiting");
	}
	Thread t;
	String name;
	NewThread(String n)
	{
		t=new Thread(this,n);
		name=n;
		t.start();
	}
}