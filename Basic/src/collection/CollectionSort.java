package collection;

	import java.util.*;  
	  
	class Student implements Comparable<Student> {  
	    public String name;  
	  public Student(String name) {  
	    this.name = name;  
	  }  
	  public int compareTo(Student person) {  
	    return name.compareTo(person.name);  
	      
	  }   
	}  
	public class CollectionSort {  
	  public static void main(String[] args) {  
	      ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Nisha"));  
	      al.add(new Student("Guru"));  
	      al.add(new Student("Rahul"));  
	      al.add(new Student("Pluto"));  
	      
	    Collections.sort(al);  
	    for (Student s : al) {  
	      System.out.println(s.name);  
	    }  
	  }  
	}  

