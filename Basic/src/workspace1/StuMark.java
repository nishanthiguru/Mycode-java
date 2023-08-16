package workspace1;
import java.util.Scanner;

public class StuMark {
	
	public static void main(String[] args) {
		
		        int mark1, mark2, mark3;
		        int totalMark;
		        double avgMark;
		        
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter marks of three subjects: ");
		        mark1 = scan.nextInt();
		        mark2 = scan.nextInt();
		        mark3 = scan.nextInt();

		        totalMark = mark1 + mark2 + mark3;

		        avgMark = (double) totalMark / 3;

		        System.out.println("Total Mark: " + totalMark);
		        System.out.println("Average Mark: " + Math.round(avgMark));

		        scan.close();
		    }
		}

	

}
