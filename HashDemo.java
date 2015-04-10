import java.util.*;
class HashDemo
{
	public static void main(String args[])
	{
		HashSet<String> hset=new HashSet<String>();
		hset.add("hi");
		hset.add("hello");
		hset.add("how");
		hset.add("are");
		System.out.println("Hash set is : "+hset);
	}
}