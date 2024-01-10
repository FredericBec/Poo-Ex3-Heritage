package fr.fms.entities;

public class Employee extends Person{

	Object BornCity;
	private String company;
	private double salary;
	
	public Employee(String name, String firstName, int age, String address, Object bornCity, String company, double salary) {
		super(name, firstName, age, address);
		this.BornCity = bornCity;
		setCompany(company);
		setSalary(salary);
	}
	

	public Employee(String name, String firstName, int age, String address, Object bornCity, String company) {
		super(name, firstName, age, address);
		setBornCity(bornCity);
		setCompany(company);
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
	public String toString() {
		return super.toString() + ", " + BornCity + ", Entreprise : " + company + ", " + salary;
	}
	
}
