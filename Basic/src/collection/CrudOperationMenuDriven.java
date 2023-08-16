package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner{
	int lno;
	String lname,ldegree;
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLdegree() {
		return ldegree;
	}
	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}
	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}
	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
	
}
public class CrudOperationMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Learner> l=new ArrayList<Learner>();
try (Scanner s = new Scanner(System.in)) {
	int choice;
	do {
		System.out.println("1. Insert data ");
		System.out.println("2. Display data ");
		System.out.println("Enter your choice: ");
		choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.print("Enter lno ");
			int lno=s.nextInt();
			System.out.print("Enter lname ");
			String lname=s.next();
			System.out.print("Enter ldegree ");
			String ldegree=s.next();
			l.add(new Learner(lno, lname, ldegree));
			break;
		
		case 2:
			Iterator<Learner> i=l.iterator();
			while(i.hasNext()) {
				Learner le=i.next();
				System.out.println(le);
			}
		}
	}while(choice!=0);
}

}
}