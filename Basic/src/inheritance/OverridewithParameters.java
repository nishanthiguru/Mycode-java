package inheritance;
class UserInput{
	public void data(int a, int b) {
		System.out.println(a+""+b);
	}
	
	class UserAddition extends UserInput{
		public void data(int a ,int b) {
			System.out.println("sum: "+ (a+b));
		}
	}
	
}
public class OverridewithParameters {

	public static void main(String[] args) {
UserInput u = new UserAddition();
u.data(3, 22);
UserInput u2 = new UserInput();
u2.data(6, 8);
	}

}
