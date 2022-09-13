/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

interface CustomerOperations{
	public void setCustomer(Customer c);
	public void getCustomer(int nid);
	public void insertCustomer(Customer c);
	public void removeCustomer(Customer c);
	public void showAllCustomers();
}
