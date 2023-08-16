package oops;
 class Privatedemo{
    int a;
    Privatedemo(int i) {
    	a=i;
    	System.out.println(a);
    }
	public void display() {
		System.out.println("display call");
		
	}
}
public class PrivateAccessEx {
    public static void main(String[] args) {
		Privatedemo d = new Privatedemo(10);
		System.out.println("value of b: " +d.a);
		d.display();
		System.out.println(d.a);
		d.a=0;
		

	}

}
