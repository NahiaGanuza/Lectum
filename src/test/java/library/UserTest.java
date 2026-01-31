package library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class UserTest {
  @Test
  void userIsCreatedTest() {
    User user = new User(01, "Nahia", "Ganuza");

    assertNotNull(user);
  }

  @Test
  void userHasIdTest() {
    User user = new User(01, "Nahia", "Ganuza");

    assertNotNull(user.getId());
    assertEquals(01, user.getId());
  }
}