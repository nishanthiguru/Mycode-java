package collection;
import java.util.TreeSet;
public class TreeSetEx{
public static void main(String[] args) {
	TreeSet<Object> ni = new TreeSet<Object>();
	ni.add(24);
	ni.add(89);
	ni.add(209);
	ni.add(873);
	ni.add(264);
	ni.add(56);
	ni.add(218);
	ni.add(0);
	TreeSet<Object> res = (TreeSet<Object>)ni.descendingSet();
	
	System.out.println("Treeset: " +res);
		}
	}


