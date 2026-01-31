package library;

public class Book {
  private int id;
  private String title;
  private String isbn;
  private Author author;

  private boolean available;

  /**
   * Constructor.
   * @param id
   * @param title
   * @param isbn
   * @param author
   */
  public Book(int id, String title, String isbn, Author author, boolean available) {
    this.id = id;
    this.title = title;
    this.isbn = isbn;
    this.author = author;
    this.available = available;
  }

  /**
   * Setter id.
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Setter title.
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }
  /**
   * Setter isbn.
   * @param isbn
   */
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  /**
   * Setter author.
   * @param author
   */
  public void setAuthor(Author author) {
    this.author = author;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
  /**
   * Getter id.
   * @return id
   */
  public int getId() {
    return this.id;
  }

  /**
   * Getter title.
   * @return id
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Getter isbn.
   * @return isbn
   */
  public String getIsbn() {
    return this.isbn;
  }

  /**
   * Getter author.
   * @return author
   */
  public Author getAuthor() {
    return this.author;
  }

  public boolean getAvailable() {
    return this.available;
  }

  public void returnBook() {
    this.available = true;
  }

  public void lendBook() {
    this.available = false;
  }

  @Override
  public String toString() {
    return title + " - " + author.getName() + " (" + (available ? "Available" : "Not available") + ")";
  }
}
