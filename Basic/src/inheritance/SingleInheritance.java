package inheritance;
//Superclass
 class Student {
	 String name = "Nishanthi";
	 
	 void display() {
		 System.out.println(name);
	}

}
//subclass
 class Developer extends Student {
	 String role = "Full stack Developer";
	 
	 void displayRole() {
		 System.out.println(role);
	 }
 }
 
 public class SingleInheritance {
	 
	 public static void main(String[] args) {
		 Developer d1 = new Developer();
		 d1.display();
		 d1.displayRole();
	 }
 }