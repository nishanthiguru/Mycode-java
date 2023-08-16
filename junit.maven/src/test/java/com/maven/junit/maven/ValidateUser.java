package com.maven.junit.maven;

import java.util.Scanner;

@functionalInterface

interface Validate{
	boolean login(String uname,String passsword);
}


public class ValidateUser {
	boolean login(String uname,String password) {
		Validate v = (u,p)-> {
			return(uname.equals("nishanthi")&&(password.equals("n")))?true:false;
		};
		return v.login(uname, password);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name and password");
		String password = sc.next();
		ValidateUser v = new ValidateUser();
		System.out.println(v.login(password, password));
		

	}


}