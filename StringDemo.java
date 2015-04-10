class StringDemo
{
	public static void main(String args[])
	{
		box mybox=new box();
		System.out.println(mybox);
		char c[]={'J','A','V','A'};
		String s1=new String(c);
		String s2=new String(c,1,3);
		String s3=new String(s1+s2);
		fgh j=new fgh(12);
		System.out.println(j);
		int a=s1.length();
		//int b=c[].length();
		int g="Hello".length();
		char d=s1.charAt(2);
		char e[]=new char[20];
		s1.getChars(1,3,e,2);
		byte f[]=s1.getBytes();
		String s4="java";
		System.out.println("both are equal"+s1.equals(s4));
		System.out.println("both are equal"+s1.equalsIgnoreCase(s4));
		System.out.println("s1 is : "+s1);
		System.out.println("s2 is : "+s2);
		System.out.println("s3 is : "+s3);
		System.out.println("length is : "+a);
		System.out.println("hello length is : "+g);
		System.out.println("char at 2 in java is : "+d);
		for(int i=0;i<=5;i++)
		System.out.println("e array is : "+e[i]);
		System.out.println("f byte array is : "+f);
		System.out.println("starts with ja"+s1.startsWith("ja"));
		System.out.println("ends with va"+s1.endsWith("va"));
		System.out.println("archana and rachana comparison : "+("archana".compareTo("rachana")));
	}
}



