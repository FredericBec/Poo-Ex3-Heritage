package fr.fms.entities;

public class City {
	
	private String cityName;
	private String country;
	private int residentNumber;
	
	public City(String cityName, String country, int residentNumber) {
		this.cityName = cityName;
		this.country = country;
		this.residentNumber = residentNumber;
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
		this.residentNumber = residentNumber;
	}

	@Override
	public String toString() {
		return  cityName + ", " + country + ", " + residentNumber + " d'habitants";
	}
	
	
}
