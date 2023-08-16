package oops;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class CalculateAge {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter your birth date yyyy-mm-dd format only");
			String st = sc.nextLine();
			
			LocalDate Dob;
			Dob = LocalDate.parse(st);
			System.out.println("Age is :" +calcAge(Dob));
		}
	}
	static int calcAge(LocalDate Dob)
	{
		LocalDate currentDate = LocalDate.now();
		int age = Period.between(Dob, currentDate).getYears();
		return age;
		

	}

}
