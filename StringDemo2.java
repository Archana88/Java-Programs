class StringDemo2
{
	public static void main(String args[])
	{
		System.out.println("archanachacha".indexOf("cha"));
		System.out.println("archanachacha".lastIndexOf("cha"));
		String s6="monika";
		//String s7=s6.subString(3);
		//System.out.println(s7);
		//System.out.println(s6.subString(3,4));
		System.out.println("monika".concat(" bedi"));
		System.out.println("monika".replace("o","ou"));
		System.out.println("           monika        ".trim());
		System.out.println(String.valueOf(2));
		box b=new box();
		String.valueOf(b);
		System.out.println("monika".toUpperCase());
		System.out.println("ARCHANA".toLowerCase());
		StringBuffer s5=new StringBuffer(40);
		System.out.println("appended: "+s5.append("Hi"+"hello"));
		System.out.println("ARCHANA".toLowerCase());
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer(12);
		StringBuffer s3=new StringBuffer("abc");
		System.out.println("default capacity="+s1.capacity());
		System.out.println("int capacity="+s2.capacity());
		System.out.println("string capacity="+s3.capacity());
		StringBuffer s4=new StringBuffer("java");
		s4.setCharAt(2,'j');
		s4.replace(1,3,"al");//add replace
		System.out.println("set charat 2 for java to j : "+s4);
		System.out.println("inset lava at 2 of java "+(s4.insert(2,"lava")).delete(2,6)); //add delete here
		System.out.println("reversed string : "+s4.reverse());
		String s=new String();
		s="hello";
		System.out.println(s);
	}
}



