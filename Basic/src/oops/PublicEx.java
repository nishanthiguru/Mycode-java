package oops;

public class PublicEx {
	public String s = "Nisha";
	public void display() {
		System.out.println("My name :" +s);
	}

	public static void main(String[] args) {
		PublicEx p = new PublicEx();
		p.display();
	}

}
