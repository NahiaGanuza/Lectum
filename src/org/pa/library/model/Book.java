package org.pa.library.model;

import java.util.ArrayList;
import java.util.List;


public class Book {

	private String title;
	private String description;
	private Author author;

	public Book() {
		this.title = "";
		this.description = "";
		author = new Author();
	}

	public Book(String title, String description, Author author) {
		this.title = title;
		this.description = description;
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void setDescription(String description) {
		this.description = description;
	}



}
