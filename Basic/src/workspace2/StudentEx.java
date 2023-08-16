package workspace2;

public class StudentEx {
	int rno;
	String name;
	public StudentEx() {
		rno=15;
		name="Nishaguru";
	}
	public StudentEx(int rno,String nm) {
		this.rno=rno;
		name=nm;
	}
	public StudentEx(String nm) {
	 rno=34;
	name=nm;
}
	void display()  {
		System.out.println("Student rollno: " +rno);
		System.out.println("Student name: " +name);
	}
	public static void main(String[] args) {
		StudentEx s=new StudentEx();
		s.rno=1;
		s.name="Nisha";
		s.display();
		StudentEx s1=new StudentEx();
		s1.rno=2;
		s1.name="rahul";
		s1.display();
		
		StudentEx s2=new StudentEx();
		s2.name="guru";
		s2.display();
		

	}
}

