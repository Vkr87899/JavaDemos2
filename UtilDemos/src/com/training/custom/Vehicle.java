package com.training.custom;

import java.util.Comparator;

public class Vehicle{
	private String mpdel;
	private String brand;
	private double price;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String mpdel, String brand, double price) {
		super();
		this.mpdel = mpdel;
		this.brand = brand;
		this.price = price;
	}
	public String getMpdel() {
		return mpdel;
	}
	public void setMpdel(String mpdel) {
		this.mpdel = mpdel;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [mpdel=" + mpdel + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
