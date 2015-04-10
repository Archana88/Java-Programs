class CallerThread implements Runnable
{
	Thread t;
	String msg;
	CallMe target;
	CallerThread(CallMe tar,String s)
	{
		target=tar;
		msg=s;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}