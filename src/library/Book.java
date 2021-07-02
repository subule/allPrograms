package library;

public class Book extends WrittenItem{
	public float bPrice;
	@Override
	public void addTitle(String bookTitle) {
		setTitleM(bookTitle);
	}

	@Override
	public void addAuthor(String bookAuthor) {
		setAuthor(bookAuthor);
	}

	@Override
	public void addNumber(int bookNumber) {
		setUin(bookNumber);
	}

	@Override
	public void addPrice(float bookPrice) {
		this.bPrice = bookPrice;
	}

	@Override
	public void checkIn() {
		
		
	}

	@Override
	public void checkOut() {
		
		
	}

}
