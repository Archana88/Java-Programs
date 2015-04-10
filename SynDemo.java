class SynDemo
{
	public static void main(String args[])
	{
		CallMe target=new CallMe();
		new CallerThread(target,"Archana");
		new CallerThread(target,"Veena");
		new CallerThread(target,"Suchi");
	}
}