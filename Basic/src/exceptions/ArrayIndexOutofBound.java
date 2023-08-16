package exceptions;

public class ArrayIndexOutofBound {
    
	public static void main(String[] args) {
		try {
			int[] a = {1,2,3,4};
			System.out.println(a[1]);
		    
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Error in code:" +a);
		}catch(ArithmeticException a) {
			System.out.println("Number cannot be divide by zero" + a);
		}
	}

}
