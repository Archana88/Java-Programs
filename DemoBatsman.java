class DemoBatsman
{
	public static void main(String args[])
	{
		Batsman bm=Batsman.kohli;
		Batsman bm1=Batsman.sachin;
		int a=bm.getrun();
		double c=bm.getavg();
		int b=bm.ordinal();
		System.out.println(a+" "+b+" "+c);
		System.out.println(bm1.compareTo(bm));
	}
}

