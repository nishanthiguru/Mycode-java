package workspace1;

public class ShiftOperator {

	public static void main(String[] args) {
		int a = 20; int b = 10;
		String s = "hello";
		String s1 = "hello";
		System.out.println("== :" +(s==s1));
		System.out.println("!= :" +(a!=b));
		System.out.println("== :" +(a==b));
		System.out.println("Equals :" +(s.equals(s1)));
		
		int c= 1010;
		int d=1111;
		System.out.println("& :"+(c&d));
		System.out.println("~ :"+(~d));
		System.out.println("| :"+(c|d));
		
		//shift operator
		int x = 2262;
		System.out.println(">> :"+(x>>1));
		System.out.println(">>> :"+(x>>>1));
		System.out.println("<< :"+(x<<1));
		
		


	}

}
