package workspace1;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = s.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("The given no is " +n+ " is EVEN");
		}
		else
		{
			System.out.println("The given number is " +n+ " is ODD");
		}

	}

}
