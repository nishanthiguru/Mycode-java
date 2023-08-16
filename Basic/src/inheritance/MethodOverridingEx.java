package inheritance;

class Learner{
	 void lname() {
		System.out.println("My name is Sharly Raj");
	}

	 void courseName()
	{
		System.out.println("Java full Stack");
		}
	 
	 void courseDuration(){
		 System.out.println("4 months");
	 }
	}
class Lcourse extends Learner{
	protected void courseName()//Cannot reduce the visibility of inherited method in child class
	{
		super.courseName();
		System.out.println("data analytics");
		}
	@Override
	void courseDuration(){
		 System.out.println("2 months");
	 }
	
	void analytics() {
		System.out.println("Analytics");
	}
	
}

public class MethodOverridingEx {

	public static void main(String[] args) {
Lcourse l=new Lcourse();
l.courseName();
l.lname();
l.courseName();
l.courseDuration();
//Learner le=new Learner();
//le.courseName();
//le.lname();
}

}
