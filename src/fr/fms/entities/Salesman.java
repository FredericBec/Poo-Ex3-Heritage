package fr.fms.entities;

public class Salesman extends Person{
	
	Object BornCity;
	private String company;
	private double percentageCA;
	
	public Salesman(String name, String firstName, int age, String address, Object bornCity, String company,
			double percentageCA) {
		super(name, firstName, age, address);
		setBornCity(bornCity);
		setCompany(company);
		setPercentageCA(percentageCA);
	}
	

	public Object getBornCity() {
		return BornCity;
	}


	public void setBornCity(Object bornCity) {
		BornCity = bornCity;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public double getPercentageCA() {
		return percentageCA;
	}

	public void setPercentageCA(double percentageCA) {
		if(percentageCA <= 0) {
			System.out.println("Le pourcentage du chiffre d'affaire ne peut être inférieur à 0");
			this.percentageCA = 1.0;
		}else
		this.percentageCA = percentageCA;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + "% CA : " + percentageCA;
	}

	
}
