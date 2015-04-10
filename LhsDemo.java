import java.util.*;

class LhsDemo
{
	public static void main(String args[])
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Hi");
		lhs.add("Hello");
		lhs.add("Gracious");
		lhs.add("Thanks");
		lhs.add("Sorry");
		lhs.add("Bye");
		System.out.println("Linked hash set is : "+lhs);
	}
}
