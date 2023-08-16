package inheritance;

import java.util.Scanner;

class Amsterdam{
	public int countAm(String s) {
		String str = s.toLowerCase();
		int cnt = 0;
		String a[] = str.split(" ");
		for (int i =0;i<a.length;i++) {
			if(a[i].equals("am")) {
				cnt = cnt+1;
			}
		}
		return 0;
	}
}
public class OccuranceEx {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String s = scan.nextLine();
			Amsterdam a1 = new Amsterdam();
			int count = a1.countAm(s);
			System.out.println("Print count" +count);
		}
		

	}

}
