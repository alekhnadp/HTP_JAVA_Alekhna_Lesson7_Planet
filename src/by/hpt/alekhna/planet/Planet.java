package by.hpt.alekhna.planet;

/*Методы: вывести на консоль название материка, планеты, количество мате-
риков.
вывести название планеты, всю инфу о материках этой плаанеты, 
метод - вывести по названию материка
 все страны на нем, плащать, населниие...
 добавить новый материк, создать новую страну на материке, */
public class Planet {
	private Continent[] continents;
	private Ocean[] oceans;
	private Island[] islands;

	private int age;
	private String name;

	public Continent[] getContinents() {
		return continents;
	}

	public Ocean[] getOceans() {
		return oceans;
	}

	public Island[] getIslands() {
		return islands;
	}

	public void structOfEarth(int age) {
		if (age < 100000 && age > 530) {
			continents = new Continent[1];
			continents[0] = new Continent("Pangey", 148939063133L, 0, 0);
			islands = new Island[1];
			islands[0] = new Island("небыло там островов");
			oceans = new Ocean[1];
			oceans[0] = new Ocean("Pantalass", 579569679L, 20, null);
		} else if (age > 175 && age <= 530) {
			continents = new Continent[4];
			continents[0] = new Continent("Gondwana", 37234765783L, 0, 0);
			continents[1] = new Continent("Laurentia", 37234765783L, 0, 0);
			continents[2] = new Continent("Baltics", 37234765783L, 0, 0);
			continents[3] = new Continent("Siberia", 37234765783L, 0, 0);
			islands = new Island[2];
			islands[0] = new Island("Indostan");
			islands[1] = new Island("Indostan1");
			oceans = new Ocean[2];
			oceans[0] = new Ocean("Pantalass", 386379786, 20, islands);
			oceans[1] = new Ocean("Tetis", 579569679, 10, islands);
		} else if (age < 175 && age > 0) {
			islands = new Island[11];
			islands[0] = new Island("Bora-bora");
			islands[1] = new Island("GreenLand");
			islands[2] = new Island("Pashi");
			islands[3] = new Island("Madagaskar");
			islands[4] = new Island("New Zealand");
			islands[5] = new Island("New Guinea");
			islands[6] = new Island("Britan");
			islands[7] = new Island("Island");
			islands[8] = new Island("Cuba");
			islands[9] = new Island("Sahalin");
			islands[10] = new Island("Malta");
			continents = new Continent[7];
			continents[0] = new Continent("Australia", 7692000, 1, 24130000);
			continents[1] = new Continent("Africa", 30370000, 55, 1200000000);
			continents[2] = new Continent("Antarctida", 14000000, 0, 5000);
			continents[3] = new Continent("South America", 17840000, 12, 387489196);
			continents[4] = new Continent("Nouth America", 24710000, 3, 579000000);
			continents[5] = new Continent("Europa", 10180000, 50, 742500000);
			continents[6] = new Continent("Asia", 44580000, 50, 4200000000L);
			oceans = new Ocean[4];
			oceans[0] = new Ocean("Indian", 76000000, 7209, islands);
			oceans[1] = new Ocean("Atlantic", 91000000, 8742, islands);
			oceans[2] = new Ocean("Pacific", 178000000, 11022, islands);
			oceans[3] = new Ocean("Arctic", 14000000, 5527, islands);

		}
	}

}
