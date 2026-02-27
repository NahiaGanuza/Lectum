package library;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;
    private String email;

    public User(int id, String username, String email) {
      this.id = id;
      this.username = username;
      this.email = email;
    }

    public User() {
      this.id = -1;
      this.username = "";
      this.email = "";
    }

    public void setId(int id) {
      this.id = id;
    }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public String getUsername() {
    return this.username;
  }

  public String getEmail() {
    return email;
  }
}
