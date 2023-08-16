package inheritance;
class Learner{
	public void lname() {
		System.out.println("My name is Nishanthi");
	}
 void courseName() {
		System.out.println("java fullstack");
	}
	

  void courseDuration() {
	 System.out.println("4 months");
  }
}

class Lcourse extends Learner{
	 void courseName()//Cannot reduce the visibility of inherited method in child class
	{
		
		System.out.println("data analytics");
	}


void courseDuration() {
	System.out.println("2 months");
}
public class MethodOverridingClass {

	public static void main(String[] args) {
		Lcourse l = new Lcourse();
		l.courseName();
		l.lname();
	}
}
}
		
		
		

	


