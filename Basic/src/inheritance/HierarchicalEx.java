package inheritance;

 class Vehicle {
	void display() {
		int num = 22;
		System.out.println("Parent class" +num);	}
}
 
 class Ferrari extends Vehicle{
	 void ferraricar() {
		 System.out.println("First child");
	 }
 }
 
 class Lamborgini extends Vehicle{
	 void lamborginicar() {
		 System.out.println("second child");
	 }
	 }
 class Bugatti extends Vehicle{
	 void luxuarycar() {
	 }
 }
 public class HierarchicalEx {
	public static void main(String[] args) {
	 
        Ferrari f = new Ferrari();
		f.ferraricar();
		Lamborgini l = new Lamborgini(); 
		l.lamborginicar();
		Bugatti b = new Bugatti();
		b.luxuarycar();

	}

}
