package model;

import java.util.ArrayList;
import java.util.List;

public class User {
	public enum Role {
		USER, ADMIN
	}

	private String email;
	private String passwordHash;
	private Role role;
	private String fullName;
	private List<Book> ownedBooks;
	private List<Book> borrowedBooks;
	private List<Book> lentBooks;

	public User(String email, String passwordHash, String fullName, Role role) {
		this.email = email;
		this.passwordHash = passwordHash;
		this.role = role;
		this.fullName = fullName;
		this.ownedBooks = new ArrayList<>();
		this.borrowedBooks = new ArrayList<>();
		this.lentBooks = new ArrayList<>();
	}

	public String getEmail() {
		return email;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public Role getRole() {
		return role;
	}

	public String getFullName() {
		return fullName;
	}

	public List<Book> getOwnedBooks() {
		return ownedBooks;
	}

	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public List<Book> getLentBooks() {
		return lentBooks;
	}

	public void registerOwnedBook(Book book) {
		this.ownedBooks.add(book);
	}

	public void unregisterOwnedBook(Book book) {
		this.ownedBooks.remove(book);
	}

	public void registerBorrowedBook(Book book) {
		this.borrowedBooks.add(book);
	}

	public void unregisterBorrowedBook(Book book) {
		this.borrowedBooks.remove(book);
	}

	public void registerLentBook(Book book) {
		this.lentBooks.add(book);
	}

	public void unregisterLentBook(Book book) {
		this.lentBooks.remove(book);
	}
}
