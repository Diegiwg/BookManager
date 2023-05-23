package model.entity;

public class BookEntity {
	private int id;
	private String title;
	private String author;
	private int year;
	private UserEntity owner;

	public BookEntity(String title, String author, int year, UserEntity owner) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.owner = owner;
	}

	public BookEntity(int id, String title, String author, int year, UserEntity owner) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public UserEntity getOwner() {
		return owner;
	}

}
