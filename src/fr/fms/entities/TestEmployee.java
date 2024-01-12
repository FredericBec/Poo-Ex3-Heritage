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
		
		System.out.println("\n------------------------------------------\n");
		//Affichage avec soit un salaire à 0 soit un pourcentage du chiffre d'affaire à 0.
		Employee johnson = new Employee("Johnson", "Dwayne", 51, "habitant aux USA", new City("Hayward", "USA", 160000), "Disney", 0.0);
		Salesman dupont = new Salesman("Dupont", "Harry", 50, "habitant à Paris", new Capital("Papeete", "Tahiti", 27000, "Pointe Vénus"), "Audi", 0.0);
		System.out.println(johnson);
		System.out.println(dupont);
		
	}
}
