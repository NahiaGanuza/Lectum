package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BookTest {
  private Author author() {
    return new Author(1, "Sarah", "J. Maas", "USA");
  }

  @Test
  void bookIsCreated() {
    Book b = new Book(1, "Throne of Glass", "9781408832332", author(), true);

    assertEquals(1, b.getId());
    assertEquals("Throne of Glass", b.getTitle());
    assertEquals("9781408832332", b.getIsbn());
    assertEquals("Sarah", b.getAuthor().getName());
    assertTrue(b.getAvailable());
  }

  @Test
  void bookChangesAvailability() {
    Book b = new Book(1, "Throne of Glass", "9781408832332", author(), true);
    b.lendBook();

    assertFalse(b.getAvailable());
  }

  @Test
  void bookReturnChangesAvailability() {
    Book b = new Book(1, "Throne of Glass", "9781408832332", author(), true);
    b.returnBook();

    assertTrue(b.getAvailable());
  }

  @Test
  void availabilityToString() {
    Book b = new Book(1, "Throne of Glass", "9781408832332", author(), true);

    String s = b.toString();

    assertTrue(s.contains("Throne of Glass"));
    assertTrue(s.contains("Sarah"));
    assertTrue(s.contains("Available"));
  }

  @Test
  void bookIsChanged() {
    Book b = new Book(1, "Throne of Glass", "9781408832332", author(), true);
    Author a2 = new Author(2, "Sarah2", "Maas", "ES");

    b.setId(55);
    b.setTitle("New");
    b.setIsbn("NewIsbn");
    b.setAuthor(a2);
    b.setAvailable(false);

    assertEquals(55, b.getId());
    assertEquals("New", b.getTitle());
    assertEquals("NewIsbn", b.getIsbn());
    assertEquals("Sarah2", b.getAuthor().getName());
    assertFalse(b.getAvailable());
  }
}
