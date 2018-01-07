package by.hpt.alekhna.planet;

public class Ocean {
	private String name;
	private long place;
	private int maxDepth;
	private Island islands[];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPlace() {
		return place;
	}

	public void setPlace(long place) {
		this.place = place;
	}

	public int getMaxDepth() {
		return maxDepth;
	}

	public void setMaxDepth(int maxDepth) {
		this.maxDepth = maxDepth;
	}

	public Island[] getIslands() {
		return islands;
	}

	public void setIslands(Island[] islands) {
		this.islands = islands;
	}

	public Ocean(String name, long place, int maxDepth, Island[] islands) {
		this.name = name;
		this.place = place;
		this.maxDepth = maxDepth;
		this.islands = islands;
	}

}
