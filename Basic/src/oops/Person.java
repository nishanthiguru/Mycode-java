package oops;
		class Person {
			private String name;
			public Person (String name) {
				this. name = name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public void displayPerson() {
				System.out.println("Data of the Person class: ");
				System.out.println("Name: " + this.name);
			}
		}
		public class StudentAccess extends Person {
			public StudentAccess(String name) {
				super(name);
			}
			public void displayStudent() {
				System.out.println("Data of the Student class: ");
			}

			public static void main(String[] args) {
				StudentAccess std = new StudentAccess("Nisha");
				System.out.println(std.getName());
			
				std.setName("Nisha");
				System.out.println(std.getName());
				std.displayPerson();
				std.displayStudent();
			}
			private char[] getName() {
				// TODO Auto-generated method stub
				return null;
			}
		

	}


