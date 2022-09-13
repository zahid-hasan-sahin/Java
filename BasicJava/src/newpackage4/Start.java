
package newpackage4;

import java.util.ArrayList;
import java.util.Scanner;
public class Start{
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		int option;
		int i=0;
                ArrayList<Customer> c=new ArrayList<Customer>();
		
		while(true){
		
		System.out.println("1)Employee Management"+"\t"+"2)Customer Management \t 3)Account Transactions 4)Exit");
		System.out.print("Choose Option: ");
		option=input.nextInt();
                
		switch(option){
		case 1:
			System.out.println("1)Insert New Employee"+"\t"+"2)Remove Existing Employee\t 3)Show All Employee\t 4)Going Back");
			break;
		case 2:
			
			System.out.println("1)Insert New Customer"+"\t"+"2)Remove Existing Customer\t 3)Show All Customer\t 4)Going Back");
			System.out.println("Choose Option: ");
			int optionInCustomer;
			
			String name;
			int nid;
			
			int accNumber;
			double balance;
			optionInCustomer=input.nextInt();
			switch(optionInCustomer){
				case 1:	
					c.add(new Customer());									
					System.out.print("Customer's Name: ");
					input.nextLine();
					name=input.nextLine();
					c.get(i).setName(name);
                                	System.out.print("Customer's NID: ");
					nid=input.nextInt();
					c.get(i).setNid(nid);
					System.out.print("Customer's AccountNumber: ");
					accNumber=input.nextInt();
					c.get(i).setAcountNumber(accNumber);
					System.out.print("Customer's Balance: ");
					balance=input.nextDouble();
					c.get(i).setBalance(balance);
									
					i++;
                                   
					break;
					
					
				case 2:
                             
					try{
					for(int j=0;j<i;j++){
					System.out.println("AAAAAA");
					c.get(j).showAllAccounts();
					}
					}
					
					
					catch(Exception e)
					{
						System.out.println("Error is: "+e);
					}
					System.out.println("Enter Cusmter's Account Number");
					accNumber=input.nextInt();
					//c[i].removeAccount(c[i].getAccount(a[i].getAccountNumber()));
					break;
				case 3:
					
				//c[i].showAllAccounts();
					break;
				case 4:
					continue;
					
			}
		
			break;
			
		case 3:
			
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
	
  }
}