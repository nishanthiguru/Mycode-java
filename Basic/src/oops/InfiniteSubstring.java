package oops;

import java.util.Scanner;

public class InfiniteSubstring {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter string S: ");
	        String S = scanner.nextLine();
	        System.out.print("Enter string A: ");
	        String A = scanner.nextLine();

	        if (isSubstringInfinite(S, A)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	    }

	    private static boolean isSubstringInfinite(String S, String A) {
	        String INF = "";
	        // Generate the infinite string INF
	        while (INF.length() < A.length()) {
	            INF += S;
	        }

	        // Check if A is a substring of INF
	        //INF-->hellonisha
	        //A-->hellnishahello
	        if (INF.contains(A)) {
	            return true;
	        }

	        return false;
	    }
	}
	
