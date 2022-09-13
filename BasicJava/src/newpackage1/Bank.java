
package newpackage1;
public abstract class Bank implements CustomerOperations, EmployeeOperations{
	Customer customers;
	Employee employees;
        @Override
	public void setCustomer(Customer c){
		this.customers=c;
	}
        @Override
	public void getCustomer(int nid){
	}
        @Override
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
	public void getEmployee(String empId){
		//System.out.println(getName()+getEmpId()+getSalary());
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