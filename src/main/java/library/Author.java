package library;

import java.io.Serializable;

public class Author implements Serializable {
  private int id;
  private String name;
  private String surname;
  private String nationality;

  /**
   * Constructor Author.
   * @param id unique identifier
   * @param name author's name
   * @param surname author's surname
   * @param nationality author's nationality
   */
  public Author(int id, String name, String surname, String nationality) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.nationality = nationality;
  }

  /**
   * Setter id.
   * @param id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Setter name.
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Setter surname.
   * @param surname
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * Setter nationality.
   * @param nationality
   */
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  /**
   * Getter id.
   * @return id.
   */
  public int getId() {
    return this.id;
  }

  /**
   * Getter name.
   * @return name.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Getter surname.
   * @return surname.
   */
  public String getSurname() {
    return this.surname;
  }

  /**
   * Getter nationality.
   * @return nationality.
   */
  public String getNationality() {
    return this.nationality;
  }

  public String getFullName() {
    return this.name + " " + this.surname;
  }
}
