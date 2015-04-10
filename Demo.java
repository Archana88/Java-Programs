class Demo
{
	public static void main(String args[])
	{
		NewThread t1=new NewThread("Child 1");
		NewThread t2=new NewThread("Child 2");
		System.out.println("Child 1 is alive: "+t1.t.isAlive());
		System.out.println("Child 2 is alive: "+t2.t.isAlive());
			try
			{
					t1.t.join();
					t2.t.join();
			}
			catch(Exception e)
			{
			System.out.println("Main Thread Interrupted");
		    }
		System.out.println("Child 1 is alive: "+t1.t.isAlive());
		System.out.println("Child 2 is alive: "+t2.t.isAlive());
	}
}