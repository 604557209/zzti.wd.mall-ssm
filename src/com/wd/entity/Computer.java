package com.wd.entity;

public class Computer {
	private int id;
	private String pic;
	private String brand;
	private double price;
	private String pc_model;
	private String pc_size;
	private String pc_weight;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
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
	public String getPc_model() {
		return pc_model;
	}
	public void setPc_model(String pc_model) {
		this.pc_model = pc_model;
	}
	public String getPc_size() {
		return pc_size;
	}
	public void setPc_size(String pc_size) {
		this.pc_size = pc_size;
	}
	public String getPc_weight() {
		return pc_weight;
	}
	public void setPc_weight(String pc_weight) {
		this.pc_weight = pc_weight;
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", pic=" + pic + ", brand=" + brand
				+ ", price=" + price + ", pc_model=" + pc_model + ", pc_size="
				+ pc_size + ", pc_weight=" + pc_weight + "]";
	}
	public Computer(int id, String pic, String brand, double price,
			String pc_model, String pc_size, String pc_weight) {
		super();
		this.id = id;
		this.pic = pic;
		this.brand = brand;
		this.price = price;
		this.pc_model = pc_model;
		this.pc_size = pc_size;
		this.pc_weight = pc_weight;
	}
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
}