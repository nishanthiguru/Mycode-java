package fileexample;
import java.io.File;
import java.io.IOException;


public class FileProperty {
	public static void main(String[] args) throws IOException {
		File newFile = new File("C:/Users/ASUS/eclipse-workspace/CorejavaPart1/src/filehandling/ListOfCourses3.pdf");//absolute
		File newFile1 = new File("C://filehandling/ListOfCourses4.txt");//absolute

		System.out.println("Absolute path"+newFile1.getAbsolutePath());
		File newFile11 = new File("ListOfCourses2.txt");//relative
		System.out.println("Relative path "+newFile11.getCanonicalPath());
		System.out.println("Absolute Path "+newFile11.getAbsolutePath());
		System.out.println("RW :"+newFile11.canRead());
		System.out.println("Read Write :"+newFile11.canWrite());
		System.out.println("File Name :"+newFile11.getName());
		System.out.println("Size of the file :"+newFile11.length());
		System.out.println(newFile11.getParent());
	
		File newFileF2 = new File("C:\\Edu bridge");//relative
		String[] list = newFileF2.list();
		System.out.println("List of files :"+list.length);
		for(int i =0;i<list.length;i++) {
			System.out.println(list[i]);
		}
		
//		if (newFile.createNewFile()) {
//			System.out.println("File created.");
//		} else {
//			System.out.println("File exists.");
//		}
		
	}
}
