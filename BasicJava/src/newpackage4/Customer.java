/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage4;

public class Customer implements AccountOperations {

    public String name;
    public int nid;
    Account accounts = new Account();

    public void setName(String name) {
        accounts.name = name;
    }

    public void setNid(int nid) {
        accounts.nid = nid;
    }

    public void setAcountNumber(int accountNumber) {
        accounts.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        accounts.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getNid() {
        return nid;
    }

    public void insertAccount(Account a) {
        this.accounts = a;
    }

    public void removeAccount(Account a) {
        a = null;
    }

    public Account getAccount(int accountNumber) {
        return accounts;
    }

    public void showAllAccounts() {
        System.out.println(accounts.getAccountNumber());
    }
}
