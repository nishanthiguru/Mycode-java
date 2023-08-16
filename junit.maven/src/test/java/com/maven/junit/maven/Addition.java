package com.maven.junit.maven;
import.static.org.junit.Assert.assertEquals;
import.org.junit.Test;
public class Addition {
	public int add(int a,int b) {
		return a+b;
	}
	@Test
	public void addTest() {
		assertEquals(4, add(2,2));
	}

}


