package library;

public class Video extends MediaItem{

	private String director;
	private String genre;
	private int yearReleased;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	@Override
	public void addSerialNumer(int videoNum) {
		setUin(videoNum);
	}
	@Override
	public void addTitle(String videoTitle) {
		setTitleM(videoTitle);
	}
	public void addVideoDetails(String videoDir, String vidGenre, int yearRels) {
		setDirector(videoDir);
		setGenre(vidGenre);
		setYearReleased(yearRels);
	}
	@Override
	public void checkIn() {
		
		
	}
	@Override
	public void checkOut() {
		
		
	}
}
