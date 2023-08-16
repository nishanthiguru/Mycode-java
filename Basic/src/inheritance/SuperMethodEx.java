package inheritance;
 class Person11{  
int id;  
String name;  
Person11(int id,String name){  
this.id=id;  
this.name=name;  
}
public void Person1(int id2, String name2) {
	// TODO Auto-generated constructor stub
}  
}  
class Emp extends Person11{  
float salary;  
Emp(int id,String name,float salary){  
super(int,name);//reusing parent constructor  
this.salary=salary;  
}  
void display(){
	System.out.println(id+" "+name+" "+salary);}  
}  
 class SuperMethodEx{  
public static void main(String[] args){  
Emp e1=new Emp(1,"Nishanthi",45000f);  
e1.display();  
}
}




