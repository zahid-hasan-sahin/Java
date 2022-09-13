/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;


import java.util.ArrayList;
public class Bank implements CustomerOperations, EmployeeOperations{
	ArrayList<Customer> customers;
	ArrayList<Employee> employees;
	Bank(){
		customers=new ArrayList<Customer>();
		employees=new ArrayList<Employee>();
	}
	public void setCustomer(Customer c){
		customers.add(c);
	}
	public void getCustomer(int nid){
		boolean flag=false;
		for(int i=0;i<customers.size();i++)
		if(customers.get(i).getNid()==nid){
			System.out.println("Found in DataBase");
			flag=true;
		}
			if(flag==false){
			System.out.println("This NID can't find in DataBase");
			}
	}
	public void insertCustomer(Customer c){
		customers.add(c);
	}
	public void removeCustomer(Customer c){
		customers.remove(c);
		System.out.println("Deleted");
	}
	public void showAllCustomers(){
		for(Customer c: customers){
			System.out.println("Name: "+c.getName());
			System.out.println("NID: "+c.getNid());
		}
	}
	public void setEmployees(Employee e){
		employees.add(e);
	}
	public void getEmployee(String empId){
		for(int j=0;j<customers.size();j++){
		if(empId.equals(employees.get(j).getName())){
			System.out.println("Found!!!");
			this.removeEmplyee(employees.get(j));
			}
		
		else
			System.out.println("Not Found!!!");
		}
	}
	public void insertEmployee(Employee e){
		employees.add(e);
	}
	public void removeEmplyee(Employee e){
		employees.remove(e);
		System.out.println("Deleted");
		
		
	}
	public void showAllEmployees(){
		for(Employee e: employees){
			System.out.println("Name: "+e.getName());
			System.out.println("EmployeeID: "+e.getEmpId());
			System.out.println("Employee's Salary: "+e.getSalary());
		
		}
	}
}



