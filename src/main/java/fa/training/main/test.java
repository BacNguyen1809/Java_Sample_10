/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package fa.training.main;

import java.util.Scanner;

import fa.training.entities.Employees;

public class test {
	public static void main(String[] args) {
		Employees[] employee = new Employees[5];
		
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Input information employee "+(i+1));
			employee[i] = new Employees();
			employee[i].input();
		}
	// Display employees have salary >= 1000
		System.out.println("Employees have salary greater than 1000: ");
		for (int i = 0; i < employee.length; i++) {
			if(employee[i].getSalary()>= 1000) {
				System.out.println(employee[i].toString());
			}
		}
		
	}
}
