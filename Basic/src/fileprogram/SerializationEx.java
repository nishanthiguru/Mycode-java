package fileprogram;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		StudentEx ob = new StudentEx();
		ob.id = 1;
		ob.name = "Nishanthi";
		ob.degree = "B.tech";
		FileOutputStream fos = new FileOutputStream("fileEx.txt");
		ObjectOutputStream os = new  ObjectOutputStream(fos);
		
	os.writeObject(ob);
	os.close();
	fos.close();
	System.out.println("Data saved in the file");
	}

}
