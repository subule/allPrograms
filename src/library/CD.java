package library;

public class CD extends MediaItem {

	private String artist;
	private String genre;
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void addSerialNumer(int cdNum) {
		setUin(cdNum);
	}
	@Override
	public void addTitle(String cdTitle) {
		setTitleM(cdTitle);
	}
	
	public void addCdDetails(String cdArtist, String cdGenre) {
		this.artist=cdArtist;
		this.genre=cdGenre;
	}
	@Override
	public void checkIn() {
		
		
	}
	@Override
	public void checkOut() {
		
		
	}
}
