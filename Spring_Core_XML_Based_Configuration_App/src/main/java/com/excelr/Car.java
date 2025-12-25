package com.excelr;

public class Car {

	private Integer carPrice;
	private String carName;
	
//	Generate POJO Class
	
	// Generate Normal Constructor	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Generate Constructor using fields
	public Car(Integer carPrice, String carName) {
		super();
		this.carPrice = carPrice;
		this.carName = carName;
	}

	// Generate Setter() and Getter()
	public Integer getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(Integer carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	// Generate toString()
	@Override
	public String toString() {
		return "Car [carPrice=" + carPrice + ", carName=" + carName + "]";
	}
	
}
