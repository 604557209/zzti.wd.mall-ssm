package com.wd.entity;

public class Book {
	private int id;
	private String pic;
	private String brand;
	private double price;
	private String book_press;
	private String book_isbn;
	private int book_pages;
	private String book_author;
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
	public String getBook_press() {
		return book_press;
	}
	public void setBook_press(String book_press) {
		this.book_press = book_press;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public int getBook_pages() {
		return book_pages;
	}
	public void setBook_pages(int book_pages) {
		this.book_pages = book_pages;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", pic=" + pic + ", brand=" + brand
				+ ", price=" + price + ", book_press=" + book_press
				+ ", book_isbn=" + book_isbn + ", book_pages=" + book_pages
				+ ", book_author=" + book_author + "]";
	}
	public Book(int id, String pic, String brand, double price,
			String book_press, String book_isbn, int book_pages,
			String book_author) {
		super();
		this.id = id;
		this.pic = pic;
		this.brand = brand;
		this.price = price;
		this.book_press = book_press;
		this.book_isbn = book_isbn;
		this.book_pages = book_pages;
		this.book_author = book_author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
