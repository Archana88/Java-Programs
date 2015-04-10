public enum Batsman
{
	sachin(100,10.8),sourav(80,3.7),kohli(90,5.6);
	private int run;
	private double avg;
	Batsman(int r,double a)
	{
		run=r;
		avg=a;
	}
	public int getrun()
	{
		return run;
	}
	public double getavg()
		{
			return avg;
	}
}