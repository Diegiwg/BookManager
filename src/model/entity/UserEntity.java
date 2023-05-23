package model.entity;

import java.util.ArrayList;
import java.util.List;

public class UserEntity {
	private int id;
	private String name;
	private String email;
	private String password;
	private List<BookEntity> ownedBooks;

	public UserEntity(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.ownedBooks = new ArrayList<>();
	}

	public UserEntity(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.ownedBooks = new ArrayList<>();
	}

	public UserEntity(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.ownedBooks = new ArrayList<>();
	}

	public UserEntity(int id, String name, String email, String password, List<BookEntity> ownedBooks) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.ownedBooks = ownedBooks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public List<BookEntity> getOwnedBooks() {
		return ownedBooks;
	}

	public void addOwnedBook(BookEntity book) {
		this.ownedBooks.add(book);
	}
}
