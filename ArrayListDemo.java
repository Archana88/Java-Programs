import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList<String> alist=new ArrayList<String>();
		System.out.println("Initial Size : "+alist.size());
		alist.add("Su");System.out.println("Array list : "+alist);
		alist.add("Archu");System.out.println("Array list : "+alist);
		alist.add("paps");System.out.println("Array list : "+alist);
		System.out.println("Size after adding 3 elements : "+alist.size()+" Array list : "+alist);
		alist.remove(2);System.out.println("Array list : "+alist);

		//alist.remove(3); //Array index out of bound exception thrown

		System.out.println("Size after deletion : "+alist.size()+" Array list : "+alist);
		alist.add("Suwega");System.out.println("Array list : "+alist);
		alist.add("Su");System.out.println("Array list : "+alist);
		alist.remove("Su");System.out.println("su removed : "+alist);
		System.out.println("Array list : "+alist);

		alist.add(2,"monu");
		//alist.add(5,"monu"); //Array index out of bound exception thrown
		System.out.println("final Array list : "+alist);
	}
}


