package by.hpt.alekhna.runner;

import by.hpt.alekhna.planet.Continent;
import by.hpt.alekhna.planet.Planet;

/*Создать приложение, удовлетворяющее требованиям, 
 * приведенным в задании. 
 *  Наследование применять только в тех заданиях, 
 * в которых это логически обосновано.
 Аргументировать принадлежность классу каждого создаваемого
метода и корректно переопределить для каждого класса методы 
equals(),
hashCode(), toString().*/

public class Main {
	public static void main(String[] args) {
		Planet planet = new Planet();
		planet.structOfEarth(570);
		printStuctOfEarth(planet);
		System.out.println("\n===================================");

	}

	public static void printStuctOfEarth(Planet planet) {
		System.out.println("Континенты: ");
		for (int i = 0; i < planet.getContinents().length; i++) {
			System.out.print(i + 1 + " ");
			System.out.println(planet.getContinents()[i].getName() + " Площадь: " + planet.getContinents()[i].getPlace()
					+ " км. кв. " + " Количество стран: " + planet.getContinents()[i].getCountry() + " Населние: "
					+ planet.getContinents()[i].getPopulation() + " чел.");
		}
		System.out.println("\nОкеаны: ");
		for (int i = 0; i < planet.getOceans().length; i++) {
			System.out.print(i + 1 + " ");
			System.out.println(planet.getOceans()[i].getName() + " Площадь: " + planet.getOceans()[i].getPlace()
					+ " км. кв. Максимальная глубина: " + planet.getOceans()[i].getMaxDepth() + "км. "
					+ planet.getOceans()[i].getIslands()[i].getName());
		}
	}
}