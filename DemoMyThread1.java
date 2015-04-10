class DemoMyThread1
{
	public static void main(String args[])
	{
		MyThread1 t1=new MyThread1("first",3);
		MyThread1 t2=new MyThread1("second",7);
		t1.t.setPriority(10);
	}
}