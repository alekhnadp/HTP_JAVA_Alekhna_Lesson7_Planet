package by.hpt.alekhna.runner;

import by.hpt.alekhna.planet.Continent;
import by.hpt.alekhna.planet.Planet;

/*������� ����������, ��������������� �����������, 
 * ����������� � �������. 
 *  ������������ ��������� ������ � ��� ��������, 
 * � ������� ��� ��������� ����������.
 ��������������� �������������� ������ ������� ������������
������ � ��������� �������������� ��� ������� ������ ������ 
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
		System.out.println("����������: ");
		for (int i = 0; i < planet.getContinents().length; i++) {
			System.out.print(i + 1 + " ");
			System.out.println(planet.getContinents()[i].getName() + " �������: " + planet.getContinents()[i].getPlace()
					+ " ��. ��. " + " ���������� �����: " + planet.getContinents()[i].getCountry() + " ��������: "
					+ planet.getContinents()[i].getPopulation() + " ���.");
		}
		System.out.println("\n������: ");
		for (int i = 0; i < planet.getOceans().length; i++) {
			System.out.print(i + 1 + " ");
			System.out.println(planet.getOceans()[i].getName() + " �������: " + planet.getOceans()[i].getPlace()
					+ " ��. ��. ������������ �������: " + planet.getOceans()[i].getMaxDepth() + "��. "
					+ planet.getOceans()[i].getIslands()[i].getName());
		}
	}
}