package library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
  @Test
  void addBook() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());

    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    Book b = new Book(1, "Throne of Glass", "ISBN-A", a, true);

    lib.addBook(b);

    assertEquals(1, lib.getBooks().size());
    assertSame(b, lib.getBooks().get(0));
  }

  @Test
  void registerUser() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());

    User u = new User(1, "nahia", "mail@test.com");
    lib.registerUser(u);

    assertEquals(1, lib.getUsers().size());
    assertSame(u, lib.getUsers().get(0));
  }

  @Test
  void lendBookIfAvailable() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());

    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    Book b = new Book(1, "A", "ISBN-A", a, true);

    lib.lendBook(b);

    assertFalse(b.getAvailable());
  }

  @Test
  void lendBookIfNotAvailable() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());

    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    Book b = new Book(2, "B", "ISBN-B", a, false);

    lib.lendBook(b);

    assertFalse(b.getAvailable());
  }

  @Test
  void returnBook() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());

    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    Book b = new Book(2, "B", "ISBN-B", a, false);

    lib.returnBook(b);

    assertTrue(b.getAvailable());
  }
}
