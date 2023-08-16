package oops;
import java.util.Collections;
import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Nishanthi");
		a1.add(1, "Guru");
		a1.add(2, "pluto");
		a1.add(3, "Hardin");
		ArrayList1<String> a2 = new ArrayList<>();
		a2.addAll(a2);
		System.out.println("Element in my A2 arraylist: " +a2);
		a1.set(3,"aaa");
		System.out.println("Element in my ArrayList:" +a1);
		a1.add("");
		System.out.println("Elements in the arraylist: "+a1);
		a1.remove(4);
		System.out.println("Element in my Arraylist: "  +a1);
		a1.add("bbb");
		System.out.println("elements in my arraylist: "+a1);
		ArrayList<Integer>a3 = new ArrayList<>();
		a3.add(23);
		a3.add(24);
		a3.add(25);
		a3.add(26);
		System.out.println("Elements in my A3 arraylist: "+a3);
		List<Integer>list = new ArrayList<>();
		Collections.addAll(list,23,24,25,26);
		System.out.println("'List" +list);
		Collections.sort(list);
		System.out.println("Sorting list:" +list);
	}

}
