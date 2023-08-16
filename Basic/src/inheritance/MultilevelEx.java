package inheritance;

class Animal{
	void walking() {
		System.out.println("Walking in the morning ");}
	}
class Dog extends Animal{
	void barking() {
		System.out.println("Barking on Stranger ");
	}
}
class Puppy extends Dog{
	void playing() {
		System.out.println("Playing with kids");
	}
}

public class MultilevelEx {

	public static void main(String[] args) {
	     Puppy p = new Puppy();
	     
	     p.walking();
	     p.barking();
	     p.playing();
	}

}
