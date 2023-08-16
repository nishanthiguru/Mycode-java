package exceptions;

import java.util.Scanner;

public class UserDefinedMarks {
	static //static void validateAge(int age){
	void validatemark(int mark ) throws Exception{
		if(mark>70) {
			System.out.println("you are passed");
		}
		else {
			throw new Exception("you are fail");
		}
	}
	public static void main(String[] args) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter marks:");
			int marks = s.nextInt();
			validatemark(marks);
		}

	}

}
