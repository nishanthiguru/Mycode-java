package collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashsortEx {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<>();
		name.add("Nisha");
		name.add("sandhiya");
		name.add(null);
		name.add("parkavi");
		System.out.println(name);
		name.add("Nisha");
		name.add(null);
		System.out.println(name);
		System.out.println("Retrive data using iterator: ");
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

	}

}
