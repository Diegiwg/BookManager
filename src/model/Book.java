package model;

public class Book {
	public enum State {
		AVAILABLE, BORROWED,
	}

	private String title;
	private String author;
	private int year;
	private State state;
	private User owner;
	private User borrowedBy;

	public Book(String title, String author, int year, User owner) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.state = State.AVAILABLE;
		this.owner = owner;
		this.borrowedBy = null;
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

	public State getState() {
		return state;
	}

	public User getOwner() {
		return owner;
	}

	public User getBorrowedBy() {
		return borrowedBy;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setBorrowedBy(User borrowedBy) {
		this.borrowedBy = borrowedBy;
	}

}
