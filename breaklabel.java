class breaklabel
{
	public static void main(String args[])
	{
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if(true)
					break second;
					System.out.println("Wont be printed");
				}
				System.out.println("Wont be printed");
			}
			System.out.println("After the break");
		}
	}
}