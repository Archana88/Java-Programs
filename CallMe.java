class CallMe
{
	void call(String msg)
	{
		try
		{
			System.out.println("["+msg);
			Thread.sleep(1000);
			System.out.println("]"+msg);
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}

