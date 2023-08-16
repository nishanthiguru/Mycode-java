package inheritance;
import java.util.Arrays;
import java.util.Scanner;
public class DescendingProgram {

	public static void main(String[] args) {
		int[] i= new int[10];
		try (Scanner sc = new Scanner(System.in)) {
			for(int j=0; j<=9;j++) {
				
				i[j] = Integer.parseInt(sc.nextLine());
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

	}

}