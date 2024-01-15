package fr.fms.entities;

public class City {
	
	private String cityName;
	private String country;
	private int residentNumber;
	
	public City(String cityName, String country, int residentNumber) {
		setCityName(cityName);
		setCountry(country);
		setResidentNumber(residentNumber);
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getResidentNumber() {
		return residentNumber;
	}

	public void setResidentNumber(int residentNumber) {
		if(residentNumber < 0) {
			System.out.println("Le nombre d'habitant ne peut être négatif");
		}else if(residentNumber < this.residentNumber){
			System.out.println("Impossible de réduire la population !!");
		}else {			
			this.residentNumber = residentNumber;
		}
	}
	
	@Override
	public String toString() {
		return cityName + ", " + country;
	}

	//méthode toString avec la population
	/*
	@Override
	public String toString() {
		return  cityName + ", " + country + ", " + residentNumber + " d'habitants";
	}
	*/
}
