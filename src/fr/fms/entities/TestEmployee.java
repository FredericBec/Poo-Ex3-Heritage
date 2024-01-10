package fr.fms.entities;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee gate = new Employee("Gate", "Bill", 65, "habitant aux USA" ,new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		Employee frederic = new Employee("Bec", "Frédéric", 38, "habitant à Muret", new City("Tulle", "France", 14000), "FMS", 1350.0);
		System.out.println(gate);
		System.out.println(frederic);
		
		System.out.println("\n------------------------------------------\n");
		
		Salesman durand = new Salesman("Durand", "Nestor", 45, "habitant à avenue du Château à Cheverny", new City("Bordeaux", "France", 250000), "Electro dépôt", 4.0);
		System.out.println(durand);
	}
}
