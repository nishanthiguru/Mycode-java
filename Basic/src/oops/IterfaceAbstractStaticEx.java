package oops;

interface Int1{
	void abstractmethod();
	default void display() {
		System.out.println("Interface 1...");}
	static void display1() {
		System.out.println("Static Method...");
	}
}

public class IterfaceAbstractStaticEx {

	public static void main(String[] args) {
		DefaultMethodEx dm = new DefaultMethodEx();
		((Int1) dm).display();
		((Int1) dm).abstractmethod();
		Int1.display1();
		
	}
	@override
	public void abstractmethod() {
		System.out.println("AbstractMethod");
	}

}
