package fileexample;
import java.io.File;
import java.io.IOException;
public class CanonicalPath {

	public static void main(String[] args) throws IOException {
		File newFile = new File("C:/newfile/ListOfCourses.txt");
		System.out.println("Absolute path"+newFile.getAbsolutePath());
		File newFile1 = new File("ListOfCourses.2txt");
		System.out.println("Relative path"+newFile1.getCanonicalPath());
		

	}

}
