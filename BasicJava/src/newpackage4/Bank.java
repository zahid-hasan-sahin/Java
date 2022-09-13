
package newpackage4;


public abstract class Bank implements CustomerOperations, EmployeeOperations{
	Customer customers;
	Employee employees;
	public void setCustomer(Customer c){
		this.customers=c;
	}
	
	public void insertCustomer(Customer c){
		this.customers=c;
	}
	public void removeCustomer(Customer c){
		c=null;
	}
	public void showAllCustomers(){
		System.out.println(customers);
	}
	public void setEmployees(Employee e){
		this.employees=e;
	}
	
	public void insertEmployee(Employee e){
		this.employees=e;
	}
	public void removeEmplyee(Employee e){
		e=null;
	}
	public void showAllEmployees(){
		System.out.println(employees);
	}
}