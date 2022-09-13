/*
 * A program to test two subclasses of superclass Document: ExpenseReport and DonationReceipt
 */
public class QH1
{
	public static void main(String[] args)
  {
		DonationReceipt receipt = new DonationReceipt("1934623", "T. McInerney", "Sick Kids Hospital", "SKH2321", "100.0", "March 16, 2021");
		receipt.setHeader("Sick Kids Hospital");
		
		System.out.println("Testing Donation Receipt\n");
		Document doc = receipt;
		doc.setBody("Official Receipt for Tax Purposes");
		doc.print();
		System.out.println("Expected:\nSick Kids Hospital\n\nOfficial Receipt for Tax Purposes\n\nT. McInerney\n");
		System.out.println("Receipt#: SKH2321\nAmount: 100.0\nDate: March 16, 2021");
		
		
		ExpenseDocument report = new ExpenseDocument("743432", "T. McInerney", "765432");
		report.addItem("Feb 8: Flight Toronto to Miami First Class - 6000.0USD");
		report.addItem("Feb 9: Dinner Restaurant TresExpensive - 775.0USD");
		report.addItem("Feb 10: Doctor Visit - 47000USD");
		    
		doc = report;
		System.out.println("\n\nTesting Expense Report\n");
		doc.print();
		System.out.println("Expected:\nExpense Report\n\nT. McInerney Employee Id: 765432\n\nExpenses:");
		System.out.println("1. Feb 8: Flight Toronto to Miami First Class - 6000.0USD");
		System.out.println("2. Feb 9: Dinner Restaurant TresExpensive - 775.0USD");
		System.out.println("3. Feb 10: Doctor Visit - 47000USD");
		
  }
}