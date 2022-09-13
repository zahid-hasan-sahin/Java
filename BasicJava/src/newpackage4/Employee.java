/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage4;

public class Employee{
	private String name;
	private String empid;
	private double salary;
	public void setName(String name){
		this.name=name;
	}
	public void setEmpId(String empid){
		this.empid=empid;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public String getName(){
		return name;
	}
	public String getEmpId(){
		return empid;
	}
	public double getSalary(){
		return salary;
	}
}
	
