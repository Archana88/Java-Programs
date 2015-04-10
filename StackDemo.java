import java.util.*;

class StackDemo
{
	static void showPush(Stack<Integer>st,int a)
	{
		st.push(a);
		System.out.println("push : "+a);
		System.out.println("Stack : "+st);
	}
	static void showPop(Stack<Integer>st)
		{
			Integer a=st.pop();
			System.out.println("pop : "+a);
			System.out.println("Stack : "+st);
	}
	public static void main(String args[])
	{
		Stack<Integer> st=new Stack<Integer>();
		System.out.println("Stack : "+st);
		showPush(st,48);
		showPush(st,40);
		showPush(st,120);
		showPop(st);
		showPop(st);
		showPop(st);
		try{
			showPop(st);
		}
		catch(EmptyStackException e)
		{
			System.out.println("Stack is empty");
		}
	}
}
