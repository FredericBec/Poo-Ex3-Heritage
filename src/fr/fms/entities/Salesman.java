package fr.fms.entities;


public class Salesman extends Person{
	private static final double turnover = 50000.0;
	
	Object bornCity;
	private String company;
	private double percentageTurnover;
	
	public Salesman(String name, String firstName, int age, String address, Object bornCity, String company,
			double percentageTurnover) {
		super(name, firstName, age, address);
		setBornCity(bornCity);
		setCompany(company);
		setPercentageTurnover(percentageTurnover);
	}
	

	public Object getBornCity() {
		return bornCity;
	}


	public void setBornCity(Object bornCity) {
		this.bornCity = bornCity;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public double getPercentageTurnover() {
		return percentageTurnover;
	}

	public void setPercentageTurnover(double percentageTurnover) {
		if(percentageTurnover <= 0) {
			System.out.println("Le pourcentage du chiffre d'affaire ne peut être inférieur à 0");
			this.percentageTurnover = 1.0;
		}else
		this.percentageTurnover = percentageTurnover;
	}
	
	@Override
	public double remuneration() {
		
		return percentageTurnover *= turnover/100;

	}

	@Override
	public String toString() {
		return super.toString() + ", " + bornCity + ", Entreprise : " + company + ", " + "% CA : " + percentageTurnover;
	}

	
}
