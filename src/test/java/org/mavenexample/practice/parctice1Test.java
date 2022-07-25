package org.mavenexample.practice;

import org.testng.annotations.Test;

public class parctice1Test {
	
	@Test
	public void parctice1() {
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		System.out.println("Test1-->class1");
		System.out.println("url-->"+URL);
		System.out.println("username-->"+USERNAME);
		System.out.println("password-->"+PASSWORD);
		//hi my name is siva
	
	}
	@Test
	public void parctice2() {
		
		System.out.println("Test1-->class1");
		System.out.println("Good boy");
	
	}
	@Test
	public void parctice3() {
		System.out.println("Test1-->class1");
		//hi good afternoon
	
	}
	
	

}
