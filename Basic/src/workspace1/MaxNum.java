package workspace1;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a+ " is max");
		}
		else
		{ System.out.println(b+ " is max");
	}

}
}