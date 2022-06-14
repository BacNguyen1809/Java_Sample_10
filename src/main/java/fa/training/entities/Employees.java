/*
	* @author bacng
	* @ Date Jun 14, 2022
*/
package fa.training.entities;

import java.util.Scanner;

import fa.training.utils.Validator;

public class Employees {
	private int  id;
	private String employeeName;
	private byte gender;
	private String email;
	private String address;
	private double salary;
	
	
	
	public Employees() {
		super();
	}



	public Employees(int id, String employeeName, byte gender, String email, String address, double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmployeeName() {
		return employeeName;
	}



	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public byte getGender() {
		return gender;
	}



	public void setGender(byte gender) {
		this.gender = gender;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employees [id=" + id + ", employeeName=" + employeeName + ", gender=" + gender + ", email=" + email
				+ ", address=" + address + ", salary=" + salary + "]";
	}
	
	public void input() {
		Scanner scanner =new Scanner(System.in);
		boolean status;
		System.out.println("Input id: ");
		this.id = Integer.parseInt(scanner.nextLine());
		System.out.println("Input employee name: ");
		this.employeeName = scanner.nextLine();
		//input and check gender only 0 or 1
		do {
			status =false;
			System.out.println("Input gender");
			
			try {
				this.gender = Byte.parseByte(scanner.nextLine());
				
				status =!(Validator.isGender(gender));
				
			} catch (Exception e) {
				status =true;
			}
		} while (status);
		//input email and check
		do {
			status =false;
			System.out.println("Input email: ");
			try {
				this.email = scanner.nextLine();
				status = !(Validator.isEmail(email));
			} catch (Exception e) {
				status = true;
			}
		} while (status);
		
		System.out.println("input address: ");
		this.address = scanner.nextLine();
		
		System.out.println("Input salary:");
		this.salary = Double.parseDouble(scanner.nextLine());
		
		
	}
	

}
