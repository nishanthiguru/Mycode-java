package collection;

import java.util.PriorityQueue;

class Student2{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student2(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student2 [age=" + age + ", name=" + name + "]";
	}
	public int compareTo(Student2 o) {
		if(this.getAge()>o.getAge()) {
			return 1;
		}else if(this.getAge()<o.getAge()) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class PriorityEx {

	public static void main(String[] args) {
		PriorityQueue<Student2> st = extracted();
		st.add(new Student2 (21,"Nisha"));
		st.add(new Student2 (22,"Nis"));
		st.add(new Student2 (23,"sne"));
		st.add(new Student2 (24,"sneha"));
		st.add(new Student2 (25,"sandy"));

		while(st!=isEmpty()) {
			System.out.println(st.remove());
		}
	}

	private static PriorityQueue<Student2> extracted() {
		return new PriorityQueue<Student2>();
	}

	private static PriorityQueue<Student2> isEmpty() {
		return null;
	}
}


