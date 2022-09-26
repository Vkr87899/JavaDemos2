package com.training.lang;

import java.util.Objects;

public class Vehicle {
	private String model;
	private String brand;
	private String color;
	public Vehicle() {
		super();
	}
	public Vehicle(String model, String brand, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand,  model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand)
				&& Objects.equals(model, other.model);
	}
	
}
