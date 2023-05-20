package model;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<User> users;
	private List<Book> books;

	public Library() {
		this.users = new ArrayList<>();
		this.books = new ArrayList<>();
	}

	public List<User> getUsers() {
		return users;
	}

	public List<Book> getBooks() {
		return books;
	}

	public Library registerUser(User user) {
		this.users.add(user);
		return this;
	}

	public Library registerBook(Book book) {
		this.books.add(book);
		return this;
	}

}
