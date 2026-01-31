package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AuthorTest {
  @Test
  void authorIsCreatedTest() {
    Author author = new Author(01, "Laurie", "Gilmore", "EN");

    assertNotNull(author);
  }


}
