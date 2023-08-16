package exceptions;

public class UserDefinedMovieEx {
     static void validateAge(int age) {
    	 if (age>18) {
    		 System.out.println("welcome to movie");
    	 }
    	 else {
    		 throw new ArithmeticException("invalid age for movie");
    	 }
     
     }
	public static void main(String[] args) {
	validateAge(21);	
		

	}

}
