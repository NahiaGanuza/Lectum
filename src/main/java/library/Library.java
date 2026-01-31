package library;

import java.util.List;
import java.util.logging.Logger;
public class Library {
  private static Logger logger = Logger.getLogger(Library.class.getName());
  private List<Book> books;
  private List<User> users;

  public Library(List<Book> books, List<User> users) {
    this.books = books;
    this.users = users;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void registerUser(User user) {
    users.add(user);
  }

  public void lendBook(Book book) {
    if (book.getAvailable()) {
      book.setAvailable(false);
      logger.info("Book lent: " + book.getTitle());
    } else {
      logger.warning("Book is not available: " + book.getTitle());
    }
  }


  public void returnBook(Book book) {
    if(!book.getAvailable()) {
      book.setAvailable(true);
    }
  }

  public List<Book> getBooks() {
    return this.books;
  }

}
