package workspace2;

public class StudentEx2 {
            int rno;
			String name;
			public StudentEx2(StudentEx1 s) {
				rno=s.rno;
				name=s.name;	
			}
			public StudentEx1(int rno,String nm) {
				this.rno=rno;
				name=nm;
			}
			public StudentEx1(String nm) {
				rno=34;
				name=nm;
			}
			//copy Constructor
			public StudentEx(StudentEx s) {
				rno=s.rno;
				name=s.name;
			}
			void display() {
				System.out.println("Student Rollno: "+rno);
				System.out.println("Student Name: "+name);	
			}
			public static void main(String[] args) {
				StudentEx s3=new StudentEx(17,"pujitha");//parameterized
				s3.display();
				StudentEx s=new StudentEx();//object
				s.rno=1;
				s.name="Pooja";
				s.display();
				StudentEx s1=new StudentEx();
				s1.rno=10;
				s1.name="Priya";
				s1.display();
				StudentEx s2=new StudentEx();//default
				s2.display();
				StudentEx s4=new StudentEx("Jiya");
				s4.display();
				StudentEx s5=new StudentEx(s);
				s5.display();

			}

		}

	}

}
