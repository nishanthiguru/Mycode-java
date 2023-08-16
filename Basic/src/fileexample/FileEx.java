package fileexample;
import java.io.File;
import java.io.IOException;
public class FileEx {

	public static void main(String[] args) throws IOException{
		File newFile = new File("C:/newfile/ListOfCourses.txt");
		if(newFile.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("file already exists");
		}
		

	}

}
