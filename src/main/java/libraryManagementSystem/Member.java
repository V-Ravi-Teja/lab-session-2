package libraryManagementSystem;

public class Member extends User{
	private int borrowedBooksCount;
	private int MAX_BORROW_LIMIT = 5;
	
	public int getBorrowedBooksCount() {
		return borrowedBooksCount;
	}
	
	public int getMAX_BORROW_LIMIT() {
		return MAX_BORROW_LIMIT;
	}
	
	public void setBorrowedBooksCount(int borrowedBooksCount) {
		this.borrowedBooksCount = borrowedBooksCount;
	}
	
	public void setMAX_BORROW_LIMIT(int MAX_BORROW_LIMIT) {
		this.MAX_BORROW_LIMIT = MAX_BORROW_LIMIT;
	}
	
	
	@Override
	void displayDashboard() {
		System.out.println("Member Dashboard");
		System.out.println("Name: "+getName());
		System.out.println("Contact Info: "+getContactInfo());
		System.out.println("Borrowed Books Count: "+getBorrowedBooksCount());
		System.out.println("Max Borrow Limit: "+getMAX_BORROW_LIMIT());
	}
	
	@Override
	boolean canBorrowBooks() {
		return this.borrowedBooksCount < this.MAX_BORROW_LIMIT;
	}
	
	Member(){
		super();
		this.borrowedBooksCount = 0;
	}
	
	Member(String name, String contactInfo){
		super(name, contactInfo);
		this.borrowedBooksCount = 0;
	}
	
}