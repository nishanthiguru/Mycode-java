package workspace2;

public class ArmstrongNum {

	public static void main(String[] args) {
		 int number = 371, originalNum, rem, result = 0;

	        originalNum = number;

	        while (originalNum != 0)
	        {
	            rem = originalNum % 10;
	            result += Math.pow(rem, 3);
	            originalNum /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}