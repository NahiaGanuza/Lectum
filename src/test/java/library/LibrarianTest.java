package library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {
  @Test
  void registerBook_delegaEnLibraryAddBook() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());
    Librarian l = new Librarian(1, "admin", "morning");

    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    Book b = new Book(1, "A", "ISBN", a, true);

    l.registerBook(lib, b);

    assertEquals(1, lib.getBooks().size());
    assertSame(b, lib.getBooks().get(0));
  }

  @Test
  void lendBook_delegaEnLibraryLendBook() {
    Library lib = new Library(new ArrayList<>(), new ArrayList<>());
    Librarian l = new Librarian(1, "admin", "morning");

    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    Book b = new Book(1, "A", "ISBN", a, true);

    l.lendBook(lib, b);

    assertFalse(b.getAvailable());
  }
}
