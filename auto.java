class auto
{
	public static void main(String args[])
	{
		Integer iob=new Integer(100);
		int i=iob.intValue();
		byte b=iob.byteValue();
		short s=iob.shortValue();
		System.out.println(i+" "+b+" "+s);
		Integer iob1=100;
		int a=iob1;
		System.out.println(iob1+" "+a);
		Integer iob2=400;
		byte d=iob2.byteValue();
		System.out.println(d);
	}
}
