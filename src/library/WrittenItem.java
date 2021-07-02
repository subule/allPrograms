package library;

public abstract class WrittenItem extends Item {
	private String author;
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//Inherited title, uid, and copies.
	public abstract void addTitle(String title);
	
	public abstract void addAuthor(String author);
	
	public abstract void addNumber(int number);
	
	public abstract void addPrice(float price);
	
}
