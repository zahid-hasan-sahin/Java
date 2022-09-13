import java.util.ArrayList;

//-----------Start below here. To do: approximate lines of code = 1
// Make the class ExpenseDocument a subclass of Document

//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
{
	private String employeeName, employeeId;
	private ArrayList<String> items;


	public ExpenseDocument(String id, String name, String employeeId)
	{
		super(id);
		this.employeeName = name;
		this.employeeId = employeeId;
		items = new ArrayList<String>();
	}

	//Overrides the print() method in class Document
	public void print()
	{
		String itemList = "";

		//-----------Start below here. To do: approximate lines of code = 5
		// Set the document header to "Expense Report"
		// Then append each item in the list of items to the itemList variable above. 
		// Append each item to itemList (declared above) by adding the item number (indexed from 1) followed by a ". " followed by
		// the item string itself followed by a "\n". Set the document body variable to the employee name followed by
		// " Employee Id: " followed by the employeeId followed by "\n\nExpenses:\n" followed by string itemList; Then
		// print the expense report by using the print() method in the superclass Document
		
		
		
		
		
		
		
		//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
	}

	//-----------Start below here. To do: approximate lines of code = 2
	// Create a method void addItem(String item) that adds the expense item to the array list of items
	
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.

	//-----------Start below here. To do: approximate lines of code = 2
	// Create a method void clearItems() that removes all the items from array list of items
	//Hint: look at the documentation for class ArrayList for a suitable method to use
	
	
	
	
	//-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
