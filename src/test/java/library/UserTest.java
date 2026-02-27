package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UserTest {
  @Test
  void constructorPorDefecto_inicializaVacio() {
    User u = new User();

    assertEquals(-1, u.getId());
    assertEquals("", u.getUsername());
    assertEquals("", u.getEmail());
  }

  @Test
  void constructorConCampos_ok() {
    User u = new User(1, "nahia", "nahiagi00@gmail.com");

    assertEquals(1, u.getId());
    assertEquals("nahia", u.getUsername());
    assertEquals("nahiagi00@gmail.com", u.getEmail());
  }

  @Test
  void setters_actualizanCampos() {
    User u = new User();

    u.setId(10);
    u.setUsername("user");
    u.setEmail("a@b.com");

    assertEquals(10, u.getId());
    assertEquals("user", u.getUsername());
    assertEquals("a@b.com", u.getEmail());
  }
}