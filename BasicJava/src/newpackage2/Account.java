/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;



import java.io.*;
public class Account implements ITansactions {
	

    public int accountNumber;
    public double balance;
	
	File file = new File("History.txt");
	
    public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
    }

    public void setBalance(double balance) {
		this.balance=balance;
    }

    public int getAccountNumber() {
		return accountNumber;
		
    }
	double getBalance(){
	
		return balance;
	}

    public void showInfo() {
		
    }

    @Override
    public void deposit(double amount) {
		 this.balance = this.balance + amount;
		try
		{
			
			FileWriter writer = new FileWriter(file, true);
			this.file.createNewFile();
			writer.write("Deposit ->"+amount+"\r"+"\n");	
			writer.flush();	
			writer.close();	
			System.out.println("Added transaction To History");
		}
		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
			
		
		
    }

    @Override
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
		try
		{
			
			FileWriter writer = new FileWriter(file, true);
			this.file.createNewFile();
			writer.write("Withdraw ->"+amount+"\r"+"\n");	
			writer.flush();	
			writer.close();	
			
			System.out.println("Added the transaction To History");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
    }

}


