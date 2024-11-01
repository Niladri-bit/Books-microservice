package com.assignment.book.service.BooksService.Entities;




import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class BookEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(nullable = false, unique = true)
    private String title;

    @Column(name = "authors", columnDefinition = "TEXT[]")
    private String[] authors;

    @Column(nullable = false)
    private String genre;
    
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Float price;

    @Column(nullable = false)
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

	public BookEntity(Long id, String title, String[] authors, String genre, String description, Float price,
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

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
