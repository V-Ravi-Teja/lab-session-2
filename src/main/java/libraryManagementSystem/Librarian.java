package libraryManagementSystem;

public class Librarian extends User{
	private String employeeNumber;
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	
	@Override
	void displayDashboard() {
		System.out.println("Librarian Dashboard");
		System.out.println("Name: "+getName());
		System.out.println("Contact Info: "+getContactInfo());
		System.out.println("Employee Number: "+getEmployeeNumber());
	}
	
	@Override
	boolean canBorrowBooks() {
		return true;
	}
	
	void addNewBook(Book book) {
		System.out.println("New Book Added");
	}
	
	void removeBook(Book book) {
		System.out.println("Book Removed");
	}
}
