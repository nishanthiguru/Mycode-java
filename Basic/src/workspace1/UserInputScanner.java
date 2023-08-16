package workspace1;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scanner.nextLine();
		System.out.println("name:" +name);
		System.out.println("enter your age:");
		int age = scanner.nextInt();
		System.out.println("age:" + age);
		System.out.println("enter your percentage:");
		float percentage = scanner.nextFloat();
				System.out.println("percentage:" + percentage);

	}

}
