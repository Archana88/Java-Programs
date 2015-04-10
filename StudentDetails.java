class StudentDetails{
	public static void main(String args[]){
		Student s=new Student();
		s.setid(1);
		s.setmarks(85);
		s.setname("Priya");
		s.setaddress("3rd block Jayanagar Bangalore");
		s.setsubject("Maths");
		System.out.println("Student ID is: "+s.getid());
		System.out.println("Student name is: "+s.getname());
		System.out.println("Student Address is: "+s.getaddress());
		System.out.println("Student Subject is: "+s.getsubject());
		System.out.println("Student Marks is: "+s.getmarks());
		}
		}