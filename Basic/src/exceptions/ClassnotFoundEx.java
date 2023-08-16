package exceptions;

public class ClassnotFoundEx {
//compile time ex - also checked exception
	//ex = ClassNotFoundException,IOException,SQLException
	public static void main(String[] args) {
		try {
		//Class.forName("class not exist");//compile time error
		Class.forName("inheritance.Arraybinary");//.forname is for checking whether the class is found are not
			
		//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class found");
			
		}catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
