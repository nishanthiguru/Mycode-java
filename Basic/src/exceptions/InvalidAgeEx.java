package exceptions;
class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);
	}
	
}
public class InvalidAgeEx {
	public String checkAge(int age) throws MyException {
		if(age>18) {
			return "valid age";
		}else {
			throw new MyException("invalid age");
		}
	}
	public static void main(String[] args) {
		InvalidAgeEx i = new InvalidAgeEx();
		try {
			String s=i.checkAge(24);
			System.out.println(s);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
