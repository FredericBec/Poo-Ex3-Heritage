package fr.fms.entities;

public class Employee extends Person{

	private static final double wageCosts = 0.20;
	
	Object bornCity;
	private String company;
	private double salary;
	
	public Employee(String name, String firstName, int age, String address, Object bornCity, String company, double salary) {
		super(name, firstName, age, address);
		this.bornCity = bornCity;
		setCompany(company);
		setSalary(salary);
	}
	

	public Employee(String name, String firstName, int age, String address, Object bornCity, String company) {
		super(name, firstName, age, address);
		setBornCity(bornCity);
		setCompany(company);
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		//test si le salaire saisi est 0 avec valeur minimun
		if(salary <= 0) {
			System.out.println("Le salaire ne peut être inférieur à 0");
			this.salary = 1100.0;
		}else this.salary = salary;
		
	}
	
	@Override
	public double remuneration() {
		
		return salary -= salary * wageCosts;
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + bornCity + ", Entreprise : " + company + ", " + salary;
	}
	
}
