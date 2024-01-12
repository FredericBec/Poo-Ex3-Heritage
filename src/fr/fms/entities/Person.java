package fr.fms.entities;

public abstract class Person {
	
	private String name;
	private String firstName;
	private int age;
	private String address;
	
	public Person(String name, String firstName, int age, String address) {
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract double remuneration();

	@Override
	public String toString() {
		return name + ", " + firstName + ", " + age + ", " + address;
	}
	
	
}
