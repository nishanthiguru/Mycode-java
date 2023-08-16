package fileprogram;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeserializedEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("FileEx.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentEx s = null;
		s = (StudentEx) ois.readObject();
		System.out.println(s.id+" "+s.degree );
		s.display();
		ois.close();
		fis.close();

	}

}
