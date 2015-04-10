import java.util.*;
class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<String> llist= new LinkedList<String>();
		llist.add("Su");System.out.println("Linked list : "+llist);
		llist.add("paps");System.out.println("Linked list : "+llist);
		llist.add("Archu");System.out.println("Linked list : "+llist);
		llist.add("Vina");System.out.println("Linked list : "+llist);
		llist.remove(2);System.out.println("Linked list : "+llist);
		llist.removeFirst();System.out.println("Linked list : "+llist);
		llist.removeLast();System.out.println("Linked list : "+llist);
		String s=llist.get(0);
		System.out.println("string at 0 is : "+s);
		llist.set(0,"hari");
		System.out.println("Linked list : "+llist);
	}
}
