package libraryManagementSystem;



public abstract class User{
	//Attributes
	private String userId,name,contactInfo;
	static int totalUsers = 5;
	
	//Getters and Setters
	
	public static int getTotalUsers() {
		return totalUsers;
	}
	
	public java.lang.String getName() {
		return name;
	}
	
	public java.lang.String getContactInfo() {
		return contactInfo;
	}
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public void setContactInfo(java.lang.String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	//Constructors
	User(){
		this.userId = generateUniqueId();
	}
	
	User(String name, String contactInfo){
		this.userId = generateUniqueId();
		this.name = name;
		this.contactInfo = contactInfo;
	}
	
	User(User user){
		this.userId = user.userId;
		this.name = user.name;
		this.contactInfo = user.contactInfo;
	}
	
	//Methods
	private final String generateUniqueId() {
		return "0";
	}
	
	abstract void displayDashboard();
	
	abstract boolean canBorrowBooks();
}
