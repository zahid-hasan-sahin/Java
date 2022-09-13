package newpackage1;
import java.util.ArrayList;
import java.util.Scanner;
public class Start{
	public static void main(String args[]){
		
		Scanner input=new Scanner(System.in);
		int option;
		int i=0;
                ArrayList<Customer> c=new ArrayList<>();
		ArrayList<Account> a=new ArrayList<>();
		
		while(true)
		{
			System.out.println("1)Employee Management"+"\t"+"2)Customer Management \t 3)Account Transactions 4)Exit");
			System.out.print("Choose Option: ");
			option=input.nextInt();
                
			switch(option){
			case 1:
				System.out.println("1)Insert New Employee"+"\t"+"2)Remove Existing Employee\t 3)Show All Employee\t 4)Going Back");
				break;
			case 2:
			
				System.out.println("1)Insert New Customer"+"\t"+"2)Remove Existing Customer\t 3)Show All Customer\t 4)Going Back");
				System.out.print("Choose Option: ");
				int optionInCustomer;
				String name;
				int nid;
			
				int accNumber;
				double balance;
				optionInCustomer=input.nextInt();
				switch(optionInCustomer){
					case 1:	
						c.add(new Customer());
						a.add(new Account());
						System.out.print("Customer's Name: ");
						input.nextLine();
						name=input.nextLine();
						c.get(i).setName(name);
						System.out.print("Customer's NID: ");
						nid=input.nextInt();
						c.get(i).setNid(nid);
						System.out.print("Customer's AccountNumber: ");
						accNumber=input.nextInt();
						a.get(i).setAccountNumber(accNumber);
						System.out.print("Customer's Balance: ");
						balance=input.nextDouble();
						a.get(i).setBalance(balance);
						i++;
					   break;
					
					case 2:
						int foundAt;
						System.out.println("Customer List:: ");
						try{
						for(int j=0;j<i;j++){
							a.get(j).getAccountNumber();
							}
						
						System.out.print("Enter Cusmter's Account Number: ");
						accNumber=input.nextInt();
						for(int j=0;j<i;j++){
						if(a.get(j).getAccountNumber()==accNumber){
						foundAt=j;
								}
							}
					
						}
						catch(Exception e){
						System.out.println("Error is: "+e);
						}
					
					//c.get(foundAt).removeAccount(c.get(foundAt).getAccount(accNumber));
					break;
				case 3:
					
				c.get(i).showAllAccounts();
					break;
				case 4:
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