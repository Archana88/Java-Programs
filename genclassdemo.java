class genclassdemo
{
	public static void main(String args[])
	{
		genclass<Integer,String> gc1=new genclass<Integer,String>(100,"hi");
		System.out.println(gc1.getiv1());
		System.out.println(gc1.getiv2());
	}
}
