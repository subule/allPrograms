package library;

public class JournalPaper extends WrittenItem{
	private int yearOfPub;
	public float jPrice;

	public int getYearOfPub() {
		return yearOfPub;
	}

	public void setYearOfPub(int yearOfPub) {
		this.yearOfPub = yearOfPub;
	}

	@Override
	public void addTitle(String journalTitle) {
		setTitleM(journalTitle);
	}

	@Override
	public void addAuthor(String journalAuthor) {
		setAuthor(journalAuthor);
	}

	@Override
	public void addNumber(int journalNumber) {
		setUin(journalNumber);
	}

	@Override
	public void addPrice(float journalPrice) {
		this.jPrice = journalPrice;
		
	}
	
	public void addYOP(int journalYOP) {
		this.yearOfPub = journalYOP;
		
	}

	@Override
	public void checkIn() {
		
		
	}

	@Override
	public void checkOut() {
		
		
	}

}
