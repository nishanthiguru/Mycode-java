package fileexample;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInOut {

	public static void main(String[] args)throws IOException {
		try (FileOutputStream fos = new FileOutputStream("C:\\Edu bridge")) {
			String s = "ABC";
			byte b[] = s.getBytes();
			fos.write(b);
		}
		System.out.println("content written...");
		FileInputStream fis = new FileInputStream("C:\\Edu bridge");
		System.out.println("File content is:");
		int i = fis.read();
		while(i!= -1){
			System.out.println((char)i);
			i = fis.read();
		}
		fis.close();
	}

}
