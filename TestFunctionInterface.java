package com.test.basic;

import java.util.InputMismatchException;

@FunctionalInterface
public interface TestFunctionInterface {

	void getEmployeeDetails(String name) throws InputMismatchException;
	
	String toString();
	
	default void printEmployeeDetails(String empName){
		System.out.println("the employee details are" +empName);
	}
	
	default void pringEmpoyeeCharac(String empName){
		System.out.println("emp");
	}
	
	static void printEmplStatisDetails(String emString){
		System.out.println("static details");
	}
}
