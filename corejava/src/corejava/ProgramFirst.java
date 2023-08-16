package corejava;

class Studentdata {
	public static int fee;
	public static String name="nisha";
}
public class StaticEx{

	public static void main(String[] args) {
		Studentdata.fee=1000;
		System.out.println("fee : "+Studentdata.fee);
		Studentdata.name="Guru";
		System.out.println("Name : "+Studentdata.name);
	

	}

