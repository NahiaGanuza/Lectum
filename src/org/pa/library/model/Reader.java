package org.pa.library.model;

import java.util.List;

public class Reader {

    private String name, surname;
    private int id;
    private List<Book> booksBorrowed;

    public Reader(int id, String name, String surname, List<Book> booksBorrowed) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.booksBorrowed = booksBorrowed;
    }

    public Reader (int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBooksBorrowed(List<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }



    /*
	private String fName;
	private String sName;
	private String cardNumber;
	private boolean banned;
	private List<Borrowing> borrowings;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public boolean isBanned() {
		return banned;
	}
	public void setBanned(boolean banned) {
		this.banned = banned;
	}
	
	public List<Borrowing> getBorrowings() {
		return borrowings;
	}

	public void setBorrowings(List<Borrowing> borrowings) {
		this.borrowings = borrowings;
	}*/


}
