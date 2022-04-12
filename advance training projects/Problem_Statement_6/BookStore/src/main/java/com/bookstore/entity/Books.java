package com.bookstore.entity;

public class Books {
	String Book_Id;
	String Book_Name;
	String Author;
	Double Price;

	public Books() {
	}

	public Books(String book_id, String book_name, String author, Double price) {
		super();
		Book_Id = book_id;
		Book_Name = book_name;
		Author = author;
		Price = price;
	}

	
	public String getBook_Id() {
		return Book_Id;
	}

	public void setBook_Id(String book_Id) {
		Book_Id = book_Id;
	}

	public String getBook_Name() {
		return Book_Name;
	}

	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Books [Book_id=" + Book_Id + ", Book_name=" + Book_Name + ", Author=" + Author + ", Price=" + Price
				+ "]";
	}

}
