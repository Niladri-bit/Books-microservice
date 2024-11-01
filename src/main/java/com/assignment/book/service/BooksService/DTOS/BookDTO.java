package com.assignment.book.service.BooksService.DTOS;


public class BookDTO {

	 private Long id;
	 private String title;
	 private String[] authors;
	 private String genre;
	 private String description;
	 private Float price;
	 private int stock;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public BookDTO(Long id, String title, String[] authors, String genre, String description, Float price,
			int stock) {
		super();
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.genre = genre;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
