package library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {

  User user = new User(01, "nahia", "nahiagi00@gmail.com");
  Author author = new Author(01, "Paloma", "Sanchez", "ES");
  Book book = new Book(01, "La sospecha de Sofia", "01", author, true);

  @Test
  void librarianIsCreatedTest() {
    Librarian librarian = new Librarian(01, "nahia1", "morning");
    assertNotNull(librarian);
  }



  @Test
  void librarianHasUsername() {
    Librarian librarian = new Librarian(01, "nahia1", "morning");
    assertNotNull(librarian.getUsername());
  }

  @Test
  void librarianHasShift() {
    Librarian librarian = new Librarian(01, "nahia1", "morning");
    assertNotNull(librarian.getShift());
  }

}
