package workspace2;

public class ReverseNum {

	public static void main(String[] args) {
		 int num = 2262, reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    while(num != 0) {
		    
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  }
		
		

		   

	}


