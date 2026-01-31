package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BookTest {
  Book book = new Book(01, "La sospecha de Sofia", "01", new Author(02, "Paloma", "Sanchez", "ES"), true);
  @Test
  void bookIsCreatedTest() {
    assertNotNull(book);
  }

  @Test
  void bookIsAvailable() {
    assertEquals(true, book.getAvailable());
  }


}
