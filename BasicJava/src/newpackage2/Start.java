
package newpackage2;


import java.util.ArrayList;
import java.util.Scanner;
public class Start{
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		int option;
		int i=0;
		int InsertControl=0;
	 	Account a=new Account();
        ArrayList<Customer> c=new ArrayList<>();
		ArrayList<Bank> b=new ArrayList<>();
		ArrayList<Bank> BankForEmp=new ArrayList<>();
		ArrayList<Employee> e=new ArrayList<>();
		System.out.println("\n\n\n-------------------------Welcome to The Project----------------------");
		System.out.println("----------------Application is based on user as per the choice--------------");
		System.out.println("-------------------------Choose Wishly----------------------\n\n\n\n\n\n");
		
		
		while(true)
		{
			System.out.println("1)Employee Management"+"\t"+"2)Customer Management \t 3)Account Transactions 4)Exit");
			System.out.print("Choose Option: ");
			option=input.nextInt();
                
			switch(option){
			case 1:
				boolean GoForword=true;
				while(GoForword){
				System.out.println("1)Insert New Employee"+"\t"+"2)Remove Existing Employee\t 3)Show All Employee\t 4)Going Back");
				System.out.print("Choose Option: ");
				int optionInEmployee;
				String name,empId;
				double salary;
				optionInEmployee=input.nextInt();
				switch(optionInEmployee){
				case 1:
					e.add(new Employee());
					BankForEmp.add(new Bank());
					System.out.print("Employee's Name: ");
					input.nextLine();
					name=input.nextLine();
					e.get(InsertControl).setName(name);
					
					System.out.print("Employee's ID: ");
					empId=input.nextLine();
					e.get(InsertControl).setEmpId(empId);
					
					System.out.print("Employee's Salary: ");
					salary=input.nextDouble();
					e.get(InsertControl).setSalary(salary);
					
					BankForEmp.get(InsertControl).insertEmployee(e.get(InsertControl));
					
					InsertControl++;										
					break;
				case 2:
						System.out.println("\n\n--------Printing Avilable Employees in the DataBase---------\n");
						for(int j=0;j<BankForEmp.size();j++){
							BankForEmp.get(j).showAllEmployees();
						}						
						System.out.print("Enter Employee's ID to Delete: ");
						input.nextLine();
						String ID=input.nextLine();                                                                                 
						for(int j=0;j<BankForEmp.size();j++){
							if(ID.equals(e.get(j).getEmpId())){                                                        
							BankForEmp.get(j).removeEmplyee(e.get(j));
							
							}
                                                        
						}
						
						
				
				
				
					break;
				case 3:
					System.out.println("\n\n--------Printing Avilable Employees in the DataBase---------\n");
					for(int p=0;p<BankForEmp.size();p++){
						BankForEmp.get(p).showAllEmployees();
					}
				
				
					break;
				case 4:
						GoForword=false;
						break;
				default:
					System.out.println("Invalid Input");
					
				}
			}
			break;
			case 2:
				boolean GoBackOrNot=true;
				while(GoBackOrNot){
				System.out.println("1)Insert New Customer"+"\t"+"2)Remove Existing Customer\t 3)Show All Customer\t 4)Going Back");
				System.out.print("Choose Option: ");
				int optionInCustomer;
				String name;
				int nid;
				optionInCustomer=input.nextInt();
				switch(optionInCustomer){
					case 1:	
						
						
						c.add(new Customer());
						b.add(new Bank());
						System.out.print("Customer's Name: ");
						input.nextLine();
						name=input.nextLine();
						c.get(i).setName(name);
						System.out.print("Customer's NID: ");
						nid=input.nextInt();
						c.get(i).setNid(nid);b.get(i).insertCustomer(c.get(i));
						i++;
						break;
					
					case 2:
					
					System.out.println("\n\n--------Printing Avilable Customer's in the DataBase---------\n");
					for(int j=0;j<b.size();j++){
						b.get(j).showAllCustomers();
					}
						
						int deleteItem;
						System.out.print("Enter Customer's NID to delete: ");
						deleteItem=input.nextInt();
						int index=0;
						for(int k=0;k<c.size();k++){
						if(deleteItem==c.get(k).getNid()){
							index=k;
							}
						}
						b.get(index).removeCustomer(c.get(index));
						b.remove(index);
					
						
					break;
				case 3:
					System.out.println("\n\n--------Printing Avilable Customer's in the DataBase---------\n");
					for(int j=0;j<b.size();j++){
						b.get(j).showAllCustomers();
					}
				
					break;
				case 4:
						GoBackOrNot=false;
				break;
				default:
						System.out.println("Invalid Input");
				}
			
			}
			break;
			
		case 3:
			
			boolean GoNext=true;
			while(GoNext){
				int OptionInAT;
				int AccNumber;
				double amount;
				System.out.println("1.Deposit Money\t 2.Withdraw Money\t 3.Going Back");
				OptionInAT=input.nextInt();
				switch(OptionInAT){
					case 1:
						System.out.println("Deposit Amount :");
						amount=input.nextDouble();
						a.deposit(amount);
						
						
					break;
					case 2:
						
						System.out.println("Withdraw Amount :");
						amount=input.nextDouble();
						a.withdraw(amount);
					break;
					case 3:
						GoNext=false;
					break;
					default:
					
				}
			}
			break;
		default:
			System.out.println("Invalid Input");
		}
	  }
	}
  }