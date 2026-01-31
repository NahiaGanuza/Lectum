package library;

public class Librarian {
  private int id;
  private String username;
  private String shift;

  public Librarian(int id, String username, String shift) {
    this.id = id;
    this.username = username;
    this.shift = shift;
  }

  public int getId() {
    return this.id;
  }

  public String getUsername() {
    return this.username;
  }

  public String getShift() {
    return this.shift;
  }

  public void registerBook(Library library, Book book) {
    library.addBook(book);
  }

  public void lendBook(Library library, Book book) {
    library.lendBook(book);
  }
}
