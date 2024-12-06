package libraryManagementSystem;

public abstract class Book implements Lendable{
	private String isbn,title,author;
	private boolean isAvailable;
	
	//Getters and Setters
		public String getIsbn() {
			return isbn;
		}
		
		public String getTitle() {
			return title;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public void setAvailable(boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
	
	//Methods
	public boolean lend(User user){
		if(isAvailable()) {
			setAvailable(false);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void returnBook(User user){
		setAvailable(true);
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	abstract void displayBookDetails();
	
	//constructors
	Book(){
		this.isAvailable = true;
	}
	
	Book(String isbn, String title, String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}
	
	Book(Book book){
		this.isbn = book.isbn;
		this.title = book.title;
		this.author = book.author;
		this.isAvailable = book.isAvailable;
	}
	
}
