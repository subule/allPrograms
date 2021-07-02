package library;

public abstract class Item {
	
	private int uin;
	private String titleM;
	private int copies;
	public int getUin() {
		return uin;
	}
	public void setUin(int uin) {
		this.uin = uin;
	}
	public String getTitleM() {
		return titleM;
	}
	public void setTitleM(String titleM) {
		this.titleM = titleM;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public abstract void checkIn();
	public abstract void checkOut();

}
