package inheritance;

public class Examples {
int a,b,c;

Examples(){
	this(10, 20, 30);
	System.out.println("My default constructor: ");
}
Examples(int a, int b, int c) {
	//this();//either this line or line 7 can be executed
	this.a=a;
	this.b=b;
	this.c=c;
}
void msg() {
	System.out.println("hi,hello");
}
public void setdata(int a, int b, int c) {
}

public void displaydata() {
	this.msg();//rep a current method
	System.out.println("value of a: " +a);
	System.out.println("value of b: " +b);
	System.out.println("value of c: " +c);
}
	public static void main(String[] args) {
		Examples e = new Examples(1, 2, 3);
		e.setdata(10,10,22);
		e.displaydata();

	}

}
