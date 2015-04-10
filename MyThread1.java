class MyThread1 implements Runnable
{
	public void run()
	{
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
		System.out.println("I am "+this.t.getName());
	}
	Thread t; // only for Runnable as there is no inheritance of Thread constructor in Runnable
	MyThread1(String name,int p)
	{
		t=new Thread(this,name);
		t.setPriority(p);
		t.start();
	}
}
