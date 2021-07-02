package library;

public abstract class MediaItem extends Item{

	private int runTime;

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
	public abstract void addSerialNumer(int number);
	public abstract void addTitle(String title);
}
