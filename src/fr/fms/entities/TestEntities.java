package fr.fms.entities;

public class TestEntities {

	public static void main(String[] args) {
		
		Person[] persons = new Person[5];
		persons[0] = new Employee("Gate", "Bill", 65, "habitant aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		persons[1] = new Employee("Musk", "Elon", 49, "habitant à palo alto", new City("Pretoria", "Afrique du Sud", 2400000), "Tesla", 150000.0);
		persons[2] = new Salesman("Dupont", "Robert", 50, "habitant rue des rosiers à Toulouse", new City("Limoges", "France", 133000), "brico", 5.0);
		persons[3] = new Salesman("Dupond", "Harry", 50, "habitant à Paris", new Capital("papeete", "Tahiti", 27000, "Pointe Vénus"), "Audi", 2.0);
		persons[4] = new Employee("Bec", "Frédéric", 38, "habitant à Muret", new City("Tulle", "France", 14000), "FMS", 1350.0);
		
		for(Person p : persons) {
			System.out.println(p);
		}
		
		System.out.println("\n------------------------------------------\n");
		
		for(Person p : persons) {
			System.out.println("Le salaire mensuel de " + p.getName() + ": " + p.remuneration());
		}

	}

}
