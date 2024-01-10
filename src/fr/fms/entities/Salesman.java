package fr.fms.entities;

public class Salesman extends Employee{

	private double percentageCA;
	
	public Salesman(String name, String firstName, int age, String address, Object bornCity, String company,
			double percentageCA) {
		super(name, firstName, age, address, bornCity, company);
		setPercentageCA(percentageCA);
	}

	public double getPercentageCA() {
		return percentageCA;
	}

	public void setPercentageCA(double percentageCA) {
		this.percentageCA = percentageCA;
	}

	@Override
	public String toString() {
		return super.toString() + "% CA : " + percentageCA;
	}

	
}
