package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AuthorTest {

  @Test
  void authorIsCreatedWithNationality() {
    Author a = new Author(1, "Sarah", "J. Maas", "USA");

    assertEquals(1, a.getId());
    assertEquals("Sarah", a.getName());
    assertEquals("J. Maas", a.getSurname());
    assertEquals("USA", a.getNationality());
  }

  @Test
  void authorIsModified() {
    Author a = new Author(1, "Sarah", "J. Maas", "X");

    a.setId(99);
    a.setName("Name");
    a.setSurname("Surname");
    a.setNationality("ES");

    assertEquals(99, a.getId());
    assertEquals("Name", a.getName());
    assertEquals("Surname", a.getSurname());
    assertEquals("ES", a.getNationality());
  }

  @Test
  void getFullAuthorsName() {
    Author a = new Author(1, "Sarah", "J. Maas", "USA");
    assertEquals("Sarah J. Maas", a.getFullName());
  }
}
