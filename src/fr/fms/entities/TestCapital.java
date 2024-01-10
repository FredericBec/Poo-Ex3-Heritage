package fr.fms.entities;

public class TestCapital {

	public static void main(String[] args) {
		Capital paris = new Capital("Paris", "France", 2000000, "Tour Eiffel");
		Capital madrid = new Capital("Madrid", "Espagne", 3000000, "Musée du prado");
		
		System.out.println(paris);
		System.out.println(madrid);

	}

}
