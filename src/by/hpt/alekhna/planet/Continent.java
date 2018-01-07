package by.hpt.alekhna.planet;

public class Continent {
	private String name;
	private long place;
	private int country;
	private long  population;

	public Continent(String name, long place, int country, long population) {
		this.name = name;
		this.place = place;
		this.country = country;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public long getPlace() {
		return place;
	}

	public void setPlace(long place) {
		this.place = place;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public void setName(String name) {
		this.name = name;
	}

}
