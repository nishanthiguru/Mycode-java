package collection;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> ni = new HashMap<>();
		ni.put(1,"dog");
		ni.put(2,"cat");
		ni.putIfAbsent(2,"penguin");
		ni.putIfAbsent(3, "pluto");
		System.out.println("Hashmap: " +ni);
		System.out.println("contains value:" +ni.containsValue("Nishanthi"));
		System.out.println("contains key: " +ni.containsKey(2));
		

	}

}
